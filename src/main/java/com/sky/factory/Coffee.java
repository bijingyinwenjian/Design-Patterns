package com.sky.factory;

public class Coffee {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSugar(){
        System.out.println("Coffee加糖");
    }

    public void addMilk(){
        System.out.println("Coffee加奶");
    }
}
