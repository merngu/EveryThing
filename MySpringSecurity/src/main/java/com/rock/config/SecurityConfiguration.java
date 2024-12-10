package com.rock.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.rsocket.EnableRSocketSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Map;

/**
 * FileName: SecurityConfiguration
 * Author: bai
 * Date:   20242024/5/21下午5:30
 * Description:
 * <author> maziyu
 */
@Configuration
@EnableRSocketSecurity
public class SecurityConfiguration {
    MapReactiveUserDetailsService userDetailsService(){
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("user")
                .password("password")
                .roles("SETUP")
                .build();
        // @formatter:on
        return new MapReactiveUserDetailsService(user);
    }
}
