package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

// 1.初始写的时候出了两个错，启动文件放的位置
// 2.run方法的传参
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HelloWorldMainSpringBoot implements CommandLineRunner {
 
    @Autowired
    private DataSource dataSource;
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMainSpringBoot.class,args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println("DataSource URL: " + dataSource.getConnection().getMetaData().getURL());
    }
}
