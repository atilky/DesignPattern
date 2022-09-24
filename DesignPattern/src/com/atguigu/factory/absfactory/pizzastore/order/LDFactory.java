package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.LDCheesePizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.LDPepperPizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;
//import com.factory.absfactory.pizzastore.pizza.*;

public class LDFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工廠模式:LDFactory");
        switch (orderType){
            case "cheese":
                return new LDCheesePizza();
            case "pepper":
                return new LDPepperPizza();
        }

        return null;
    }
}
