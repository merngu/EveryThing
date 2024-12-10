package com.example.reflection;

/**
 * FileName: A
 * Date:   20242024/8/29上午11:06
 * Description:
 * <author> maziyu
 */
public class A {

    static {
        m = 300;
    }

    static int m = 100;
}


class ClassLoadingTest{
    public static void main(String[] args) {
        System.out.println(A.m);
    }
}
