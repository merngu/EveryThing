package com.example.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.example.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.*;

/**
 * 1. 配置类 使用@Bean 标注注册组件 默认是单实例的
 * 2. 配置类本身就是组件
 * 3. proxyBeanMethods 代理bean方法
 *    最佳实战：
 *    3.1 配置类组件之间无依赖关系用Lite模式加速容器启动过程，减少判断
 *    3.2 配置类组件之间有依赖关系，方法会被调用得到之前单实例组件，用Full模式
 * 4. @Import(User.class)
 *       给容器中自动创建出这两个类型的组件，默认组件的名字就是全类名
 *
 *   Ctrl + h 显示 派生注解
 * 5. @ImportResource 导入配置文件让配置文件生效
 */

@Import(User.class)
@Configuration(proxyBeanMethods = false) // true 表名是一个bean，false不是一个
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


    /*
    * 外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
    * */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
        mybatisPlusInterceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return mybatisPlusInterceptor;
    }

    @Bean
    @ConditionalOnBean(type = "" )
    public User user(){
        return new User();
    }

}
