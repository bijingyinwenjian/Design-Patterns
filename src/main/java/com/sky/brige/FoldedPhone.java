package com.sky.brige;

public class FoldedPhone extends Phone {

    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    void open() {
        super.open();
        System.out.println("折叠样式手机");
    }

    @Override
    void close() {
        super.close();
        System.out.println("折叠样式手机");
    }

    @Override
    void call() {
        super.call();
        System.out.println("折叠样式手机");
    }
}
