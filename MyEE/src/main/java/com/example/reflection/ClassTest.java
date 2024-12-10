package com.example.reflection;

import java.lang.reflect.Field;

/**
 * FileName: ClassTest
 * Date:   20242024/8/28下午4:43
 * Description:反射测试
 * <author> maziyu
 */
public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String name = "com.example.reflection.Person";

        // 返回指定类名的Class对象
        Class<?> clazz = Class.forName(name);

        // 返回此Class对象所表示的实体（类、接口、数组类、基本类型
        //或void）名称
        System.out.println(clazz.getName());

        // 调用缺省构造函数，返回该Class对象的一个实例
        Object obj = clazz.newInstance();




        Field field = clazz.getField("name");

        field.set(obj,"jack");
        System.out.println(field.get(obj));
        System.out.println(clazz);
    }
}
