package com.heima.chuangjianzhemoshi.config_factory;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = CoffeeFactory.createCoffee("amrican");
        System.out.println(coffee.getName());

        System.out.println("=============");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
