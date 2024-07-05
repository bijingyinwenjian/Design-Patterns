package com.sky.singleton.Test02;

public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode" + singleton1.hashCode());
        System.out.println("singleton2.hashCode" + singleton2.hashCode());
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton(){
        System.out.println("被实例化了");
    }

    static {
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
