package com.heima.chuangjianzhemoshi.config_factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

public class CoffeeFactory {

    private static HashMap<String, Coffee> map = new HashMap<String, Coffee>();

    static {
        Properties p = new Properties();

        InputStream resourceAsStream = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        try {
            p.load(resourceAsStream);
            Set<Object> keys = p.keySet();
            for (Object key:
                 keys) {
                String className = p.getProperty((String) key);
                //通过反射技术创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                //将名称和对象存储到容器中
                map.put((String)key,coffee);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }


    }

    public static Coffee createCoffee(String name){
        return map.get(name);
    }


}
