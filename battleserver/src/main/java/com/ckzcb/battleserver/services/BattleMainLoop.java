package com.ckzcb.battleserver.services;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName BattleMainLoop
 * @Description
 * @Author 蛋白质先生
 * @Date 2025/4/9 16:59
 * @Version 1.0
 */
@Slf4j
@Service
public class BattleMainLoop {

    private final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    @PostConstruct
    public void start() {
        log.info("start ... ");
        scheduledExecutorService.scheduleWithFixedDelay(this::loop, 0, 5, TimeUnit.SECONDS);
    }


    private void loop() {
        log.info("loop ...");
    }

}
