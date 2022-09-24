package com.atguigu.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza{

    @Override
    public void prepare() {
        this.name = "LDPepperPizza";
        System.out.println(this.name + " prepare ");
    }
}
