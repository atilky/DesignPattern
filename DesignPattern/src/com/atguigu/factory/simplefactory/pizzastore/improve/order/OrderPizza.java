package com.atguigu.factory.simplefactory.pizzastore.improve.order;

import com.atguigu.factory.simplefactory.pizzastore.improve.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {



    /**
     * 定義簡單工廠對象
     */
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    /**
     * 購造器
     */
    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";

        this.simpleFactory = simpleFactory;

        do{
          orderType = getType();
          pizza = this.simpleFactory.createPizza(orderType);

          if(pizza != null){ //訂購成功
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
          } else {
              System.out.println(" fail ");
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
