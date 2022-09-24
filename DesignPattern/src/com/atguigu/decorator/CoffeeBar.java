package com.atguigu.decorator;

public class CoffeeBar {

    public static void main(String[] args) {

        //裝飾者模式下的訂單,2分巧克力 + 1份牛奶的LongBlack

        //1.點一份 longBlack
        Drink order = new LongBlack();
        System.out.println(order.getDescription() + ", 價格:" + order.cost());

        //2.加一份牛奶
        order = new Milk(order);
        System.out.println(order.getDescription() + ", 價格:" + order.cost());


        //3. order 加入一份巧克力
        order = new Chocolate(order);
        System.out.println("加入一份巧克力");
        System.out.println(order.getDescription() + ", 價格:" + order.cost());


    }

}
