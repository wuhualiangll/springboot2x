package com.example.quartzdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.LogManager;

@RestController
public class TestController {
    //日志
    private static final Logger logger= LoggerFactory.getLogger(TestController.class);
    //每5秒执行一次  定时器
//    @Scheduled(cron = "*/5 * * * * *")
    public void test(){
           logger.info("执行前");
    }
}
