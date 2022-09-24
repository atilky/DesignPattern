package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility3 {

    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.roadRun("機車");
        vehicle2.airRun("汽車");
    }

}

/**
 * 交通工具類
 * 雖然沒有遵守單一職責問題,但在方法上有
 * 只適合在邏輯簡單的方法適用
 */
class Vehicle2{
    public void roadRun(String vehicle){
        System.out.println(vehicle + "在公路運行");
    }
    public void airRun(String vehicle){
        System.out.println(vehicle + "在空中運行");
    }
}
