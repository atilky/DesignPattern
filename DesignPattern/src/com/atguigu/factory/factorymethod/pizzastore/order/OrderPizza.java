package com.atguigu.factory.factorymethod.pizzastore.order;


import com.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    /**
     * 定義一個抽象方法
     */
    abstract Pizza createPizza(String orderType);


    /**
     * 購造器
     */
    public OrderPizza(){
        Pizza pizza = null;
        String orderType = "";

        do{
            orderType = getType();
            /**
             * 抽象方法,由子類工廠去完成
             */
            pizza = createPizza(orderType);

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

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
