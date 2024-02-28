package com.heima.chuangjianzhemoshi.factorymethod;



public class CoffeStore {
   private Coffeefactory coffeefactory;

    public CoffeStore(Coffeefactory coffeefactory) {
        this.coffeefactory = coffeefactory;
    }

    public Coffee orderCOffee(String type){
        Coffee coffee = coffeefactory.createCoffee();
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }
}
