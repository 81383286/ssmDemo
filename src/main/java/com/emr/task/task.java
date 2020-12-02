package com.emr.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class task {
    //@Scheduled(fixedDelay = 1000)
    @Scheduled(cron = "0/5 * * * * ?")
    public void task(){
        //System.out.println("任务启动成功");
    }
}
