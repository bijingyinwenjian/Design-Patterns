package com.sky.adapter.test01;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    public int output5V() {
        int srcV = output220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
