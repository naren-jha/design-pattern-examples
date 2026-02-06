package com.narenjha.dp.command.example.smarthomeremote;

// ========== Commands for AC (capture state for undo) ==========
class AcOnCommand implements Command {
    private final AirConditioner ac;
    private boolean prevOn;
    private int prevTemp;

    public AcOnCommand(AirConditioner ac) { this.ac = ac; }

    @Override public void execute() {
        prevOn = ac.isOn();
        prevTemp = ac.getTemperature();
        ac.on();
    }

    @Override public void undo() {
        if (!prevOn) ac.off();
        ac.setTemperature(prevTemp);
    }
}

class AcOffCommand implements Command {
    private final AirConditioner ac;
    private boolean prevOn;
    private int prevTemp;

    public AcOffCommand(AirConditioner ac) { this.ac = ac; }

    @Override public void execute() {
        prevOn = ac.isOn();
        prevTemp = ac.getTemperature();
        ac.off();
    }

    @Override public void undo() {
        if (prevOn) ac.on();
        ac.setTemperature(prevTemp);
    }
}

class AcSetTempCommand implements Command {
    private final AirConditioner ac;
    private final int newTemp;
    private int prevTemp;

    public AcSetTempCommand(AirConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp = newTemp;
    }

    @Override public void execute() {
        prevTemp = ac.getTemperature();
        ac.setTemperature(newTemp);
    }

    @Override public void undo() {
        ac.setTemperature(prevTemp);
    }
}
