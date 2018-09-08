package com.springboot.quartz.config.quartz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * Created by zhh on 2018/9/6.
 * 四、任务类
 */

@Configuration
@Component // 此注解必加
@EnableScheduling // 此注解必加
public class ScheduledTasks {

    private static final Logger LOGGER = LoggerFactory.getLogger(ScheduledTasks.class);

    public void sayHello() {
        LOGGER.info("Hello world, i'm the king of the world!!!");
    }

}
