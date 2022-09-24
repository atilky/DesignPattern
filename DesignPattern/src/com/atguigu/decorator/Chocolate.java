package com.atguigu.decorator;

//具體的Decorator,調味品的class
public class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("+Chocolate");
        setPrice(3.0f);
    }
}
