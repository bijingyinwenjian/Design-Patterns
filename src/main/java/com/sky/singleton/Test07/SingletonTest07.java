package com.sky.singleton.Test07;

public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

class Singleton {

    private Singleton() {
        System.out.println("被实例了");
    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}

