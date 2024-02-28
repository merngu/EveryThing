package com.heima.chuangjianzhemoshi.factorymethod;


public class AmericanCoffeeFactory implements Coffeefactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
