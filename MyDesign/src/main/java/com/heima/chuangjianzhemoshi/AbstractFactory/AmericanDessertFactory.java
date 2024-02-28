package com.heima.chuangjianzhemoshi.AbstractFactory;



public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee createFactory() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return null;
    }
}
