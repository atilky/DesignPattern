package com.atguigu.factory.simplefactory.pizzastore.improve.order;

import com.atguigu.factory.simplefactory.pizzastore.improve.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.improve.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.improve.pizza.PepperPizza;
import com.atguigu.factory.simplefactory.pizzastore.improve.pizza.Pizza;


/**
 * 簡單工廠類
 */
public class SimpleFactory {

    /**
     * 根據orderType,返回對應的Pizza對象
     * @param orderType
     * @return
     */
    public static Pizza createPizza(String orderType){

        Pizza pizza = null;
        System.out.println("user SimpleFactory");

        if(orderType.equals("greek")){
            pizza = new GreekPizza();
        }else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
        }else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
        }

        return pizza;
    }


}
