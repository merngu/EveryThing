package com.heima.chuangjianzhemoshi.factorymethod;




public class LatteCoffeeFactory implements Coffeefactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
