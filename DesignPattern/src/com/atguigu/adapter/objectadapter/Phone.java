package com.atguigu.adapter.objectadapter;

public class Phone {

    /**
     * 充電
     */
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5){
            System.out.println("電壓正確,充電");
        } else if (iVoltage5V.output5V() > 5){
            System.out.println("電壓大於5,不充電");
        }
    }


}
