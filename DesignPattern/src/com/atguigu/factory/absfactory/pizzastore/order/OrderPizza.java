package com.atguigu.factory.absfactory.pizzastore.order;


import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory factory;

    public OrderPizza(AbsFactory factory){
         SetFactory(factory);
    }

    /**
     * 購造器
     */
    public void SetFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType = "";

        do{
            orderType = getType();
            /**
             * factory 可能是北京的工廠子類,也可能是LD
             */
            pizza = factory.createPizza(orderType);

            if(pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("order pizza fail");
                break;
            }

        }while (true);
    }

    public String getType(){

        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            return strin.readLine();
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
