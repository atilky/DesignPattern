package com.atguigu.adapter.classadapter;

/**
 * 適配器類
 */
public class VoltageAdapter extends Voltage220V implements IVoltage5V{

    @Override
    public int output5V() {

        //獲取到220V的電壓
        int srcV = output220V();

        //目標電壓
        int dstV = srcV / 44 ;

        return dstV;
    }
}
