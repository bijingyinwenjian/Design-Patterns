package com.sky.factory;

public class LatteCoffee extends Coffee {

    @Override
    public void addSugar(){
        System.out.println("LatteCoffee加糖");
    }

    @Override
    public void addMilk(){
        System.out.println("LatteCoffee加奶");
    }
}
