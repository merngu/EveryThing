package com.heima.zhuangshizhe;

public class Client {
    public static void main(String[] args) {
        FastFood food = new FriedNoodles();
        System.out.println(food.getDesc());
    }
}
