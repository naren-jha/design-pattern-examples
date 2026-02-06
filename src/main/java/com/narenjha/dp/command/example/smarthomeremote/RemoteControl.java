package com.narenjha.dp.command.example.smarthomeremote;

import java.util.Arrays;
import java.util.Objects;

class RemoteControl {
    private final Command[] onCommands;
    private final Command[] offCommands;
    private Command lastCommand = new NoCommand();

    public RemoteControl(int slots) {
        this.onCommands = new Command[slots];
        this.offCommands = new Command[slots];
        Command no = new NoCommand();
        Arrays.fill(onCommands, no);
        Arrays.fill(offCommands, no);
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = Objects.requireNonNull(onCommand);
        offCommands[slot] = Objects.requireNonNull(offCommand);
    }

    public void pressOn(int slot) {
        onCommands[slot].execute();
        lastCommand = onCommands[slot];
    }

    public void pressOff(int slot) {
        offCommands[slot].execute();
        lastCommand = offCommands[slot];
    }

    public void pressUndo() {
        lastCommand.undo();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("\n---- Remote Control ----\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot ").append(i).append("] ")
              .append(onCommands[i].getClass().getSimpleName())
              .append("  /  ")
              .append(offCommands[i].getClass().getSimpleName())
              .append("\n");
        }
        return sb.toString();
    }
}