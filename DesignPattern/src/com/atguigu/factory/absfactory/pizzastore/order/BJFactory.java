package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.atguigu.factory.absfactory.pizzastore.pizza.BJPepperPizza;

/**
 * 工廠子類
 */
public class BJFactory implements AbsFactory{

    @Override
    public Pizza createPizza(String orderType) {
        System.out.println("使用抽象工廠模式:BJFactory");
        switch (orderType){
            case "cheese":
                return new BJCheesePizza();
            case "pepper":
                return new BJPepperPizza();
        }

        return null;
    }
}
