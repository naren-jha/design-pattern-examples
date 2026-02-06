package com.narenjha.dp.command.example2.servertasks;

public class BuildCommand implements Command {

    private final String app;

    public BuildCommand(String app) {
        this.app = app;
    }

    @Override
    public void execute() {
        System.out.println("Building app: " + app);
    }
}
