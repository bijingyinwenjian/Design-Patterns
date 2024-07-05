package com.sky.singleton.Test08;

public class SingletonTest08 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

enum Singleton {
    INSTANCE;

    Singleton() {
        System.out.println("被实例了");
    }
}

