package com.heima.chuangjianzhemoshi.single;

// 饿汉式
// 该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。
// instance对象是随着类的加载而创建的。如果该对象足够大的话，而一直没有使用就会造成内存
// 的浪费。
public class Hungry {
    private Hungry() {
    }

    private static Hungry hungry = new Hungry();

    public static Hungry getHungry() {
        return hungry;
    }
}
