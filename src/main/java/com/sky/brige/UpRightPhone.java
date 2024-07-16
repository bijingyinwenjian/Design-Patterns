package com.sky.brige;

public class UpRightPhone extends Phone {
    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    void open() {
        super.open();
        System.out.println("直立样式手机");
    }

    @Override
    void close() {
        super.close();
        System.out.println("直立样式手机");
    }

    @Override
    void call() {
        super.call();
        System.out.println("直立样式手机");
    }
}
