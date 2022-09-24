package com.atguigu.builder.improve;

public class Client {

    public static void main(String[] args) {
        //蓋普通房子
        CommonHouse commonHouse = new CommonHouse();
        //準備創建房子的指揮者
        HouseDirector houseDirector = new HouseDirector(commonHouse);

        //完成蓋房子
        House house = houseDirector.constructHouse();
        System.out.println(house.getBasie());

    }
}
