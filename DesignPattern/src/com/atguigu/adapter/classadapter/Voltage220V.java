package com.atguigu.adapter.classadapter;

/**
 * 被適配的類
 */
public class Voltage220V {

    /**
     * 輸出220V電壓
     * @return
     */
    public int output220V(){
        int src = 220;
        System.out.println("電壓:" + src);
        return src;
    }

}
