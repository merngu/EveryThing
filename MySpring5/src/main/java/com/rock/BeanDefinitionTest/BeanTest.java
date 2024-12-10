package com.rock.BeanDefinitionTest;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * FileName: BeanTest
 * Date:   20242024/9/20上午11:34
 * Description:
 * <author> maziyu
 */
public class BeanTest {
    public static void main(String[] args) {
        ClassPathResource classPathResource = new ClassPathResource("spring.xml");

        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);



        int i = xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);


        // 1. loadBeanDefinitions 装载
        // 1.1

        System.out.println(i);


    }
}
