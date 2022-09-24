package com.atguigu.factory.simplefactory.pizzastore.improve.pizza;

public class PepperPizza extends Pizza {

    @Override
    public void prepare() {
        this.name = "prepare";
        System.out.println(this.name + " 準備材料");
    }
}
