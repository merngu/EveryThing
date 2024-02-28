package com.heima.chuangjianzhemoshi.easyfactory;

public class CoffeeStore {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        coffeeStore.orderCoffee("american");
    }

    public Coffee orderCoffee(String type){
        Coffee coffee = null;
        if (type.equals("american")){
            coffee = new AmericanCoffee();
        } else if (type.equals("la")){
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
