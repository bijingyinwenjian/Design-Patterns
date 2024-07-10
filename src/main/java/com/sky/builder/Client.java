package com.sky.builder;

public class Client {
    public static void main(String[] args) {
//        CommonHouse commonHouse = new CommonHouse();
//        commonHouse.build();
//        Computer computer = new Computer("i5-12600kf", "华硕b760", "32g", "1TB");
//        System.out.println(computer);
        Computer computer = new Computer.Builder().cpu("i5-12600kf").zhuban("华硕b760").ram("32g").disk("1TB").build();
        System.out.println(computer);
    }
}
