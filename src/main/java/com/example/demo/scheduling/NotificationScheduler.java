package com.example.demo.scheduling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class NotificationScheduler {

    Logger logger= LoggerFactory.getLogger(NotificationScheduler.class);

    @Scheduled(fixedRate = 5000)
    public void sentNotif(){
         logger.info("sending notification every one hour");
    }
}
