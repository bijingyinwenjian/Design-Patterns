package com.sky.factory;

public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)) {
            return new AmericanCoffee();
        } else if ("latte".equals(type)) {
            return new LatteCoffee();
        }
        return coffee;
    }

}
