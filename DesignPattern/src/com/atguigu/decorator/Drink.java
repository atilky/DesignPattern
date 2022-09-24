package com.atguigu.decorator;

public abstract class Drink {

    public String description;

    private float price = 0.0f;

    /**
     * 計算價格的抽象方法,子類來實現
     */
    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
