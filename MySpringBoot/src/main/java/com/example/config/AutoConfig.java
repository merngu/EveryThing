package com.example.config;

import com.example.bean.Order;


import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName: AutoConfig
 * Date:   20242024/11/29下午2:04
 * Description:测试自动配置
 * <author> maziyu
 */

@Configuration
public class AutoConfig {

    @Bean
    public Order test() {
        return new Order();
    }
}
