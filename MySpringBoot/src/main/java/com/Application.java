package com;


import com.example.bean.User;
import com.example.config.MpConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // 返回我们的IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        // 查看容器中的组件
        String[] names = run.getBeanDefinitionNames();

        for (String name:
             names) {
            System.out.println(name);
        }

        MpConfig mpConfig1 = run.getBean("mpConfig", MpConfig.class);
        MpConfig mpConfig2 = run.getBean("mpConfig", MpConfig.class);

        System.out.println("组件" + (mpConfig1 == mpConfig2));

        System.out.println("================");
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String name:
             beanNamesForType) {
            System.out.println(name);
        }


    }
}
