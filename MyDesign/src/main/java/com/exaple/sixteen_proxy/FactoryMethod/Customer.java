package com.exaple.sixteen_proxy.FactoryMethod;

public class Customer {
    public static void main(String[] args) {
        FactoryBMW320 factoryBMW320 = new FactoryBMW320();
        BMW320 bmw320 = (BMW320) factoryBMW320.createBMW();
    }
}
