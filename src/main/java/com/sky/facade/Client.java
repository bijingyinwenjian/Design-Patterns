package com.sky.facade;

public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开");
        smartAppliancesFacade.say("关闭");
    }
}
