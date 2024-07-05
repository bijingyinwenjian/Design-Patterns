package com.sky.singleton.Test01;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

class Singleton {

    public final static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("被实例了");
    }

    public static Singleton getInstance() {
        return instance;
    }
}

