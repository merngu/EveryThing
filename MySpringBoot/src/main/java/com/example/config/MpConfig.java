package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MpConfig {

    /**
     * MybatisPlusInterceptor 是 MyBatis-Plus 框架中的一个拦截器接口，可以用于扩展和定制 MyBatis-Plus 的功能。
     * MybatisPlusInterceptor 提供了在执行 SQL 语句前后进行拦截和处理的方法，可以在查询、更新等数据库操作之前或之后进行一些自定义的逻辑处理。
     * 您可以通过实现 MybatisPlusInterceptor 接口并重写其中的方法来实现自己的拦截逻辑。常用的方法包括：
     *
     * intercept：执行 SQL 语句前后的拦截方法，可以在 SQL 执行前后进行一些逻辑处理。
     * plugin：用于创建拦截器的代理对象，可以通过该方法将自定义的拦截器应用到 MyBatis-Plus 中。
     * setProperties：设置拦截器的属性，可以通过该方法传递一些参数给拦截器使用。
     * */


    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }
}
