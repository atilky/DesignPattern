package com.atguigu.adapter.classadapter;

public class Client {

    public static void main(String[] args) {

        System.out.println("類適配器");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());


    }

}
