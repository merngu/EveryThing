package com.example.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "datasource")
public class MyDataSource {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;
}
