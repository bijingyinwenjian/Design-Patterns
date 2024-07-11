package com.sky.adapter.test02;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public int output5V() {
        int dstV = 0;
        if (voltage220V != null) {
            int srcV = voltage220V.output220V();
            System.out.println("使用对象适配模式，进行适配！");
            dstV = srcV / 44;
            System.out.println("适配完成，输出的电压=" + dstV + "V");
        }
        return dstV;
    }
}
