package com.example.quartzdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  // 配置开机启动定时器
public class QuartzdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuartzdemoApplication.class, args);
    }

}
