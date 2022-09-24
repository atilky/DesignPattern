package com.atguigu.factory.simplefactory.pizzastore.old.pizza;

public class PepperPizza extends Pizza{

    @Override
    public void prepare() {
        this.name = "prepare";
        System.out.println(this.name + " 準備材料");
    }
}
