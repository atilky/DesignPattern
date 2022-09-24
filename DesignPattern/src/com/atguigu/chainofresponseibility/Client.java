package com.atguigu.chainofresponseibility;

public class Client {

    public static void main(String[] args) {

        //創建請求
        RequestBuyHouse requestBuyHouse = new RequestBuyHouse(50, 15, 10);

        //創建方案
        SchemeA schemeA = new SchemeA();
        SchemeB schemeB = new SchemeB();
        SchemeC schemeC = new SchemeC();

        //鏈起來
        schemeA.setNext(schemeB);
        schemeB.setNext(schemeC);
        schemeC.setNext(schemeA);

        schemeA.process(requestBuyHouse);




    }
}
