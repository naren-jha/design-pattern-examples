package com.narenjha.dp.command.example.smarthomeremote;

// ========== Commands for Fan (needs state for undo) ==========
class FanHighCommand implements Command {
    private final CeilingFan fan;
    private CeilingFan.Speed prev;

    public FanHighCommand(CeilingFan fan) { this.fan = fan; }

    @Override public void execute() {
        prev = fan.getSpeed();
        fan.high();
    }

    @Override public void undo() {
        fan.setSpeed(prev);
    }
}

class FanOffCommand implements Command {
    private final CeilingFan fan;
    private CeilingFan.Speed prev;

    public FanOffCommand(CeilingFan fan) { this.fan = fan; }

    @Override public void execute() {
        prev = fan.getSpeed();
        fan.off();
    }

    @Override public void undo() {
        fan.setSpeed(prev);
    }
}