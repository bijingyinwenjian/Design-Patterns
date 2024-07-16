package com.sky.brige;

public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    void open() {
        this.brand.open();
    }

    void close() {
        this.brand.close();
    }

    void call() {
        this.brand.call();
    }
}
