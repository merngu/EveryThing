package com.example.注解;

/**
 * FileName: FunctionalInterfaceExample
 * Date:   20242024/8/23下午5:31
 * Description:
 * <author> maziyu
 */
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // 使用 Lambda 表达式实现函数式接口
        MyFunctionalInterface myFunc = () -> System.out.println("Executing the functional method.");

        // 调用抽象方法
        myFunc.execute();

        // 调用默认方法
        myFunc.defaultMethod();

        // 调用静态方法
        MyFunctionalInterface.staticMethod();
    }
}
