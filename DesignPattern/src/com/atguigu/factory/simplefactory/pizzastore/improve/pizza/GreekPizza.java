package com.atguigu.factory.simplefactory.pizzastore.improve.pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        this.name = "Greek";
        System.out.println(this.name + " 準備材料");
    }
}
