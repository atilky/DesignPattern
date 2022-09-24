package com.atguigu.template;

public class Game2Order extends OrderTemplate{

    @Override
    void getGameOrder() {
        System.out.println("get game 2 order");
    }

    @Override
    void getGameOrderSum() {
        System.out.println("get game 2 order sum");
    }
}
