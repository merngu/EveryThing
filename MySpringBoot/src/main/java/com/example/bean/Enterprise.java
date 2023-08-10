package com.example.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties 是一个用于将外部配置属性绑定到Spring Boot应用程序中的类的注解。
 * 使用 @ConfigurationProperties 注解，您可以将配置文件中的属性值注入到特定的配置类中，然后在应用程序中使用这些属性。
 */

@Component
@ConfigurationProperties(prefix = "enterprise")
@Data
public class Enterprise {
    private String name;
    private Integer age;
    private String[] subject;
}
