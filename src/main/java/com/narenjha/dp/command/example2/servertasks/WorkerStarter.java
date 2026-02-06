package com.narenjha.dp.command.example2.servertasks;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;

@Component
public class WorkerStarter {

    private final ExecutorService executor;
    private final BlockingQueue<Command> queue;

    public WorkerStarter(ExecutorService executor,
                         BlockingQueue<Command> queue) {
        this.executor = executor;
        this.queue = queue;
    }

    @PostConstruct
    public void startWorkers() {
        executor.submit(new CommandWorker(queue));
    }
}
