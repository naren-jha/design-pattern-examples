package com.narenjha.dp.command.example.smarthomeremote;

// ========== Commands for Garage Door ==========
class GarageDoorUpCommand implements Command {
    private final GarageDoor door;
    public GarageDoorUpCommand(GarageDoor door) { this.door = door; }

    @Override public void execute() { door.up(); }
    @Override public void undo()    { door.down(); }
}

class GarageDoorDownCommand implements Command {
    private final GarageDoor door;
    public GarageDoorDownCommand(GarageDoor door) { this.door = door; }

    @Override public void execute() { door.down(); }
    @Override public void undo()    { door.up(); }
}