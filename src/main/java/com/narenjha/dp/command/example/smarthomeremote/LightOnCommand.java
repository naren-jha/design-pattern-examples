package com.narenjha.dp.command.example.smarthomeremote;

// ========== Commands for Light ==========
class LightOnCommand implements Command {
    private final Light light;
    public LightOnCommand(Light light) { this.light = light; }

    @Override public void execute() { light.on(); }
    @Override public void undo()    { light.off(); }
}

class LightOffCommand implements Command {
    private final Light light;
    public LightOffCommand(Light light) { this.light = light; }

    @Override public void execute() { light.off(); }
    @Override public void undo()    { light.on(); }
}