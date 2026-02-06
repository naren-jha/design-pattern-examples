package com.narenjha.dp.command.example2.servertasks;

public class DeployCommand implements Command {

    private final String app;
    private final String env;

    public DeployCommand(String app, String env) {
        this.app = app;
        this.env = env;
    }

    @Override
    public void execute() {
        System.out.println("Deploying " + app + " to " + env);
    }
}
