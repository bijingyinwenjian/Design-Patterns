package com.sky.factory;

public class AmericanCoffee extends Coffee {

    @Override
    public void addSugar(){
        System.out.println("AmericanCoffee加糖");
    }

    @Override
    public void addMilk(){
        System.out.println("AmericanCoffee加奶");
    }
}
