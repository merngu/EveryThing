package com.heima.chuangjianzhemoshi.single;

// 该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着
//类的加载而创建。所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题。
public class Hungry2 {
    private Hungry2() {
    }

    private  static  Hungry2 hungry2;

    static {
        hungry2 = new Hungry2();
    }

    public static Hungry2 getHungry() {
        return hungry2;
    }
}
