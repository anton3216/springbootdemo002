package com.qingqiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.qingqiao.mapper")
@EnableScheduling
public class Springbootdemo002Application {

    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo002Application.class, args);
    }

}
