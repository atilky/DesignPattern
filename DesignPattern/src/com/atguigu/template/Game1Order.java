package com.atguigu.template;

public class Game1Order extends OrderTemplate{

    @Override
    void getGameOrder() {
        System.out.println("get game 1 order");
    }

    @Override
    void getGameOrderSum() {
        System.out.println("get game 1 order sum");
    }
}
