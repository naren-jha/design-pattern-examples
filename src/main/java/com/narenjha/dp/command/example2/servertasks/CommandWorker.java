package com.narenjha.dp.command.example2.servertasks;

import java.util.concurrent.BlockingQueue;

public class CommandWorker implements Runnable {

    private final BlockingQueue<Command> queue;

    public CommandWorker(BlockingQueue<Command> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Command command = queue.take();
                command.execute();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // restore + exit
            }
        }
    }
}
