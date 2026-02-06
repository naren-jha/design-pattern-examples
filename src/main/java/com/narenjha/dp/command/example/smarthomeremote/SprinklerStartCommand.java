package com.narenjha.dp.command.example.smarthomeremote;

// ========== Commands for Sprinkler ==========
class SprinklerStartCommand implements Command {
    private final Sprinkler sprinkler;
    public SprinklerStartCommand(Sprinkler sprinkler) { this.sprinkler = sprinkler; }

    @Override public void execute() { sprinkler.start(); }
    @Override public void undo()    { sprinkler.stop(); }
}

class SprinklerStopCommand implements Command {
    private final Sprinkler sprinkler;
    public SprinklerStopCommand(Sprinkler sprinkler) { this.sprinkler = sprinkler; }

    @Override public void execute() { sprinkler.stop(); }
    @Override public void undo()    { sprinkler.start(); }
}