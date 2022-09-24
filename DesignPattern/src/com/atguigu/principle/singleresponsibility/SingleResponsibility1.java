package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("機車");
        vehicle.run("汽車");
        vehicle.run("飛機");
    }

}

/**
 * 交通工具類
 * 1. 在run的方法中違反單一職責原則
 * 2. 需要根據不同的交通工具,拆解成不同的類
 */
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路運行");
    }
}
