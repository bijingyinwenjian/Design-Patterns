package com.sky.brige;

public class Client {
    public static void main(String[] args) {
        Phone foldedPhone = new FoldedPhone(new XiaoMi());
        foldedPhone.open();
        foldedPhone.close();
        foldedPhone.call();

        Phone upRightPhone = new UpRightPhone(new Vivo());
        foldedPhone.open();
        upRightPhone.close();
        upRightPhone.call();
    }
}
