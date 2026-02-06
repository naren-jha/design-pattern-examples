package com.narenjha.dp.command.example.smarthomeremote;

import java.util.List;

// ========== Demo ==========
public class SmartHomeRemoteDemo {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl(7);

        Light livingRoomLight = new Light("Living Room");
        CeilingFan bedroomFan = new CeilingFan("Bedroom");
        AirConditioner ac = new AirConditioner();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();
        Sprinkler sprinkler = new Sprinkler();
        Curtains curtains = new Curtains();

        remote.setCommand(0, new LightOnCommand(livingRoomLight), new LightOffCommand(livingRoomLight));
        remote.setCommand(1, new FanHighCommand(bedroomFan), new FanOffCommand(bedroomFan));
        remote.setCommand(2, new AcOnCommand(ac), new AcOffCommand(ac));
        remote.setCommand(3, new GarageDoorUpCommand(garageDoor), new GarageDoorDownCommand(garageDoor));
        remote.setCommand(4, new StereoOnCommand(stereo), new StereoOffCommand(stereo));
        remote.setCommand(5, new SprinklerStartCommand(sprinkler), new SprinklerStopCommand(sprinkler));
        remote.setCommand(6, new CurtainsOpenCommand(curtains), new CurtainsCloseCommand(curtains));

        System.out.println(remote);

        remote.pressOn(0);
        remote.pressOff(0);
        remote.pressUndo();

        remote.pressOn(1);
        remote.pressUndo();

        remote.pressOn(2);
        new AcSetTempCommand(ac, 22).execute();
        remote.pressUndo(); // undo last remote command (AC ON), not temp set

        // Macro: "Movie Night" = dim lights off, close curtains, stereo on, AC on+temp
        Command movieNight = new MacroCommand(List.of(
                new LightOffCommand(livingRoomLight),
                new CurtainsCloseCommand(curtains),
                new StereoOnCommand(stereo),
                new AcOnCommand(ac),
                new AcSetTempCommand(ac, 23)
        ));

        // Put macro on slot 0 temporarily
        remote.setCommand(0, movieNight, new NoCommand());
        remote.pressOn(0);
        remote.pressUndo(); // undo macro (reverses)
    }
}