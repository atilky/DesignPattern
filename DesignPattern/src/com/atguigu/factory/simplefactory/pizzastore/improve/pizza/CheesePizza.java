package com.atguigu.factory.simplefactory.pizzastore.improve.pizza;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        this.name = "cheese";
        System.out.println(this.name + " 準備材料");
    }
}
