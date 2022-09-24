package com.atguigu.template;

public class Client {

    public static void main(String[] args) {
        OrderTemplate game1Order = new Game1Order();
        game1Order.make();

        System.out.println("----------------------------");

        OrderTemplate game2Order = new Game2Order();
        game2Order.make();

    }

}
