package com.narenjha.dp.command.example2.servertasks;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

@Configuration
public class ExecutorConfig {

    @Bean(name = "commandExecutor", destroyMethod = "shutdown")
    public ExecutorService commandExecutor(
            @Value("${executor.core.pool.size}") int corePoolSize,
            @Value("${executor.maximum.pool.size}") int maxPoolSize,
            @Value("${executor.keep.alive.time.sec}") int keepAliveTimeSec) {

        ExecutorService executorService =
                new ThreadPoolExecutor(corePoolSize, maxPoolSize, keepAliveTimeSec,
                        TimeUnit.SECONDS, new LinkedBlockingDeque<>());
        return executorService;
    }

    @Bean("commandQueue")
    public BlockingQueue<Command> commandQueue() {
        return new LinkedBlockingQueue<>();
    }
}
