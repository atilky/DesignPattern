package com.atguigu.factory.simplefactory.pizzastore.old.order;

import com.atguigu.factory.simplefactory.pizzastore.old.pizza.CheesePizza;
import com.atguigu.factory.simplefactory.pizzastore.old.pizza.GreekPizza;
import com.atguigu.factory.simplefactory.pizzastore.old.pizza.Pizza;
import com.atguigu.factory.simplefactory.pizzastore.old.pizza.PepperPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    /**
     * 購造器
     */
    public OrderPizza(){
        Pizza pizza = null;
        String orderType; //訂購披薩類型

        do{
            orderType = getType();

            if(orderType.equals("greek")){
                pizza = new GreekPizza();
            }else if(orderType.equals("cheese")){
                pizza = new CheesePizza();
            }else if(orderType.equals("pepper")){
                //違反OCP原則:對擴展開放,對修改關閉
                pizza = new PepperPizza();
            } else {
                break;
            }

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
