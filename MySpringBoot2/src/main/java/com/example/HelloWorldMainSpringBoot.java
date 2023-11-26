package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 1.初始写的时候出了两个错，启动文件放的位置
// 2.run方法的传参
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HelloWorldMainSpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainSpringBoot.class,args);
    }
}
