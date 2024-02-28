package com.example.lamadaDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {
        /**
         *  匿名类转换为表达式
         */
        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("匿名内部类写法");
            }
        };


        Runnable run1 = () -> System.out.println("lamda 写法");

        // 原来使用匿名内部类作为参数传递
        TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        });


        TreeSet<String> treeSet = new TreeSet<> (
          (o1,o2) -> Integer.compare(o1.length(),o2.length())
        );


    }
}
