package com.rock.factory;

import com.rock.bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * FileName: FactoryBean
 * Author: bai
 * Date:   20242024/5/21上午10:02
 * Description:工厂Bean
 * <author> maziyu
 */
public class FactoryBeanDemo implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setUsername("123");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        User user = UserFactory.getUser();

        System.out.println(user);
    }
}
