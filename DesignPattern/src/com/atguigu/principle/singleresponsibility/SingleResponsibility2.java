package com.atguigu.principle.singleresponsibility;

public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("機車");
        roadVehicle.run("汽車");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飛機");
    }

}

/**
 * 交通工具類
 * 1. 有遵守單一職責原則
 * 2. 改動太大,同時修改客戶單(main)
 * 3. 改進 : 直接修改vehicle類,改動的代碼會比較少
 */
class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路運行");
    }
}
class AirVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在空中運行");
    }
}

