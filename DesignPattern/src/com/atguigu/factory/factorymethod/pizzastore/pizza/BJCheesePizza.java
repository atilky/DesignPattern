package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class BJCheesePizza extends Pizza{

    @Override
    public void prepare() {
        this.name = "BJCheesePizza";
        System.out.println(this.name + " prepare ");
    }
}
