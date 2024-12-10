package com;


import com.example.bean.User;
import com.example.filter.Loggingilter;
import com.example.filter.LoginFilter;
import com.example.serverlet.HelloServlet;
import com.example.serverlet.ServletA;
import com.example.serverlet.UserServerlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

//@EnableLogRecord(tenant = "com.example.test")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        // 查看容器中的组件
        String[] names = run.getBeanDefinitionNames();

        for (String name:
             names) {
            System.out.println("bean的名称" + name);
        }


        System.out.println("================");
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String name:
             beanNamesForType) {
//            System.out.println(name);
        }
        System.out.println("================");


    }

    @Bean
    public ServletRegistrationBean<HelloServlet> heeloServerRegistrationBean() {
        ServletRegistrationBean<HelloServlet> helloServletServletRegistrationBean = new ServletRegistrationBean<>(new HelloServlet(), "/hello");
        helloServletServletRegistrationBean.addUrlMappings("/test");
        return helloServletServletRegistrationBean;
    }


    @Bean
    public ServletRegistrationBean<UserServerlet> helloServerRegistrationBean() {
        ServletRegistrationBean<UserServerlet> helloServletServletRegistrationBean = new ServletRegistrationBean<>(new UserServerlet(), "/hell");
        return helloServletServletRegistrationBean;
    }


    @Bean
    public ServletRegistrationBean<ServletA> hello1ServerRegistrationBean() {
        ServletRegistrationBean<ServletA> helloServletServletRegistrationBean = new ServletRegistrationBean<>(new ServletA(), "/hell2");
        return helloServletServletRegistrationBean;
    }


//    @Bean
//    public FilterRegistrationBean<Loggingilter> filterRegistrationBean() {
//        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
//        filterRegistrationBean.setFilter(new Loggingilter());
//        filterRegistrationBean.setOrder(1);
//        return filterRegistrationBean;
//    }

    @Bean
    public FilterRegistrationBean<LoginFilter> ffilterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new LoginFilter());
//        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }


}
