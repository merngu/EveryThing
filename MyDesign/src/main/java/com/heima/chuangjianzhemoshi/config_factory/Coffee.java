package com.heima.chuangjianzhemoshi.config_factory;

public abstract class Coffee {
    public abstract String getName();

    public void addMilk(){
        System.out.println("添加牛奶");
    }

    public void addSuger(){
        System.out.println("+糖");
    }
}
