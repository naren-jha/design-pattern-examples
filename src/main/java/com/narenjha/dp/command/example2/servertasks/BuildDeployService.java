package com.narenjha.dp.command.example2.servertasks;

import org.springframework.stereotype.Service;

import java.util.concurrent.BlockingQueue;

@Service
public class BuildDeployService {

    private final BlockingQueue<Command> queue;

    public BuildDeployService(BlockingQueue<Command> queue) {
        this.queue = queue;
    }

    public void build(String app) {
        queue.offer(new BuildCommand(app));
    }

    public void deploy(String app, String env) {
        queue.offer(new DeployCommand(app, env));
    }
}
