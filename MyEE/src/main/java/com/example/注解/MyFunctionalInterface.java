package com.example.注解;

/**
 * FileName: MyFunctionalInterface
 * Date:   20242024/8/23下午5:29
 * Description:
 * <author> maziyu
 */

@FunctionalInterface
public interface MyFunctionalInterface {
    void execute();

    // 可以有默认方法
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // 可以有静态方法
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
