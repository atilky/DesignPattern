package com.atguigu.factory.absfactory.pizzastore.pizza;

public class BJPepperPizza extends Pizza {

    @Override
    public void prepare() {
        this.name = "BJPepperPizza";
        System.out.println(this.name + " prepare ");
    }
}
