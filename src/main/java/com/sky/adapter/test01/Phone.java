package com.sky.adapter.test01;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        int v = iVoltage5V.output5V();
        if (v == 5) {
            System.out.println("电压为5V，可以充电～");
        } else if (v > 5) {
            System.out.println("电压大于5V，不可以充电～");
        }

    }
}
