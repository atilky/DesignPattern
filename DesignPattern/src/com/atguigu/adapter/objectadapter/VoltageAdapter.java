package com.atguigu.adapter.objectadapter;

/**
 * 適配器類
 */
public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    /**
     * 通過建構子,傳入Voltage220V 實例
     * @param voltage220V
     */
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {

        if(voltage220V != null){
            //獲取到220V的電壓
            int srcV = voltage220V.output220V();
            //目標電壓
            int dstV = srcV / 44 ;
            System.out.println("對象適配器,輸出電壓:" + dstV);
            return dstV;
        }

        return 0;
    }
}
