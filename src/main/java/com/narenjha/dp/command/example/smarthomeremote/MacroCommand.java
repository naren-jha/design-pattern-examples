package com.narenjha.dp.command.example.smarthomeremote;

import java.util.List;
import java.util.ListIterator;

// ========== Macro Command (one button triggers many) ==========
class MacroCommand implements Command {
    private final List<Command> commands;

    public MacroCommand(List<Command> commands) {
        this.commands = List.copyOf(commands);
    }

    @Override public void execute() {
        for (Command c : commands) c.execute();
    }

    @Override public void undo() {
        // reverse undo is usually what you want
        ListIterator<Command> it = commands.listIterator(commands.size());
        while (it.hasPrevious()) it.previous().undo();
    }
}