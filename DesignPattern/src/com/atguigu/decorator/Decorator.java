package com.atguigu.decorator;

public class Decorator extends Drink{

    private Drink drink;

    public Decorator(Drink drink) { //組合關係
        this.drink = drink;
    }

    @Override
    public float cost() {
        /**
         * getPrice 自己的價格
         */
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        String description = super.description;
        float price = super.getPrice();
        String drinkDescription = drink.getDescription(); //被裝飾者的信息
        return  description + " " + price + " " + drinkDescription;
    }
}
