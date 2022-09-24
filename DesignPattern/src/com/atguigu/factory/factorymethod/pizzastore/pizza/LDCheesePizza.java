package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza{

    @Override
    public void prepare() {
        this.name = "LDCheesePizza";
        System.out.println(this.name + " prepare ");
    }
}
