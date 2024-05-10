package com.example;

import java.util.function.Consumer;

/**
 * FileName: ConsumerDemo
 * Author: bai
 * Date:   20242024/4/30下午5:07
 * Description:ConsumerDemo
 * <author> maziyu
 */
public class ConsumerDemo {
    public static void main(String[] args) {
        // 定义一个Consumer，它接受一个String类型的输入参数，并执行打印操作作为副作用
        Consumer<String> printer = System.out::println;

        // 使用Consumer实例接受一个字符串并打印
        printer.accept("Hello, Java Functional Interfaces!");

        // 另一个使用Consumer的例子，这次我们传递一个不同的字符串
        printer.accept("Demonstrating side-effects with Consumers.");
    }
}
