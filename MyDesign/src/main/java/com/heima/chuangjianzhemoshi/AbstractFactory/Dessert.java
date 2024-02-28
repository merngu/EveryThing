package com.heima.chuangjianzhemoshi.AbstractFactory;

public abstract class Dessert {
    public String getString(String name){
        return name;
    }


    public void addMilk(){
        System.out.println("添加牛奶");
    }

    public void addSuger(){
        System.out.println("+糖");
    }
}
