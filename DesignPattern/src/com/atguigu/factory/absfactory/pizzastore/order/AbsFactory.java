package com.atguigu.factory.absfactory.pizzastore.order;

import com.atguigu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * 一個抽象工廠模式的抽象接口
 */
public interface AbsFactory {

    /**
     * 讓下面的工廠子類來具體實現
     */
    public Pizza createPizza(String orderType);

}
