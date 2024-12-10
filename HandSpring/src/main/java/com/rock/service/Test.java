package com.rock.service;

import com.rock.Spring.ApplicationContext;

/**
 * FileName: Test
 * Date:   20242024/9/4下午7:47
 * Description:
 * <author> maziyu
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ApplicationContext(AppConfig.class);

        Object userService = applicationContext.getBean("userService");
    }
}
