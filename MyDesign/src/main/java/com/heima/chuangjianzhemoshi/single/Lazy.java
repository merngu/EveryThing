package com.heima.chuangjianzhemoshi.single;

public class Lazy {
    private Lazy() {
    }

    private static Lazy lazy;


    public static Lazy getLazy() {
        if (lazy == null) {
            lazy = new Lazy();
        }
        return lazy;
    }

}
