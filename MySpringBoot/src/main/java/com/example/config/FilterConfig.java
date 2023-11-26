package com.example.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;


@Configuration
public class FilterConfig {

    private class Builder<T extends Filter>{

        private FilterRegistrationBean<T> filterRegistrationBean = null;

        public Builder(FilterRegistrationBean<T> filterRegistrationBean){
            this.filterRegistrationBean = filterRegistrationBean;
        }

        public Builder filterConfiguration(Class<? extends Filter> clazz,int order,boolean async,String ...patterns){
            T filter = null;
            try {
                filter  = (T)clazz.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                System.out.println("[ " + clazz.toString() + " ] 过滤器对象不存在");
            } ;

            this.filterRegistrationBean.setFilter(filter);

            this.filterRegistrationBean.setOrder(order);

            String clazzPath = clazz.toString().toLowerCase(Locale.ROOT);
            this.filterRegistrationBean.setName(clazzPath.substring(clazzPath.lastIndexOf(".")));
            this.filterRegistrationBean.addUrlPatterns(patterns);
            return this;
        }

    }

    @Bean
    public FilterRegistrationBean<UserFilterConfig> userfilterConfigFilterRegistrationBean(){
        FilterRegistrationBean<UserFilterConfig> userFilter = new FilterRegistrationBean<>();
        Builder<UserFilterConfig> userBuilder = new Builder<>(userFilter);
        userBuilder.filterConfiguration(UserFilterConfig.class,1,false,"/test/*");
        return userFilter;
    }


    @Bean
    public FilterRegistrationBean<AuthFilterConfig> authfilterConfigFilterRegistrationBean(){
        FilterRegistrationBean<AuthFilterConfig> authFilter = new FilterRegistrationBean<>();
        Builder<AuthFilterConfig> authBuilder = new Builder<>(authFilter);
        authBuilder.filterConfiguration(AuthFilterConfig.class,6,false,"/*");
        return authFilter;
    }
}
