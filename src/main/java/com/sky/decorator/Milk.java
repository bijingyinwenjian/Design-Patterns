package com.sky.decorator;

public class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("牛奶");
        setPrice(2);
    }
}
