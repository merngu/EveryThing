package com.example.reflection;

/**
 * FileName: ClassLoaderExample
 * Date:   20242024/8/29上午11:30
 * Description:学习类加载器
 * <author> maziyu
 */
public class ClassLoaderExample {
    public static void main(String[] args) {
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        System.out.println(systemClassLoader);


        ClassLoader parent = systemClassLoader.getParent();

        System.out.println(parent);
    }
}
