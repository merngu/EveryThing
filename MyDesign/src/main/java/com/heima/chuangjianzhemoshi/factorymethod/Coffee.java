package com.heima.chuangjianzhemoshi.factorymethod;

public abstract class Coffee {
    public String getName(String name){
        return name;
    }

    public void addMilk(){
        System.out.println("添加牛奶");
    }

    public void addSuger(){
        System.out.println("+糖");
    }
}
