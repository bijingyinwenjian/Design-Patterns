package com.sky.decorator;

public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(1.5);
    }
}