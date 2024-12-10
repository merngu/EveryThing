package com.rock.factory;

import com.rock.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * FileName: UserFactory
 * Author: bai
 * Date:   20242024/5/21上午9:44
 * Description:工厂类
 * <author> maziyu
 */
public class UserFactory {
    public static User getUser() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String className = "com.rock.bean.User";
        Class<?> aClass = Class.forName(className);
        return (User) aClass.newInstance();
    }


    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        System.out.println(getUser());


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        System.out.println(context.getBean("user"));


    }
}
