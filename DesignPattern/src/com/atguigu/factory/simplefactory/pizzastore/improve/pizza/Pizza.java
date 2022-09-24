package com.atguigu.factory.simplefactory.pizzastore.improve.pizza;

/**
 * 將pizza做成抽象方法
 */
public abstract class Pizza {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 準備原材料,不同pizza不一樣,因此我們做成抽象方法
     */
    public abstract void prepare();

    public void bake(){
        System.out.println(name + " baking ");
    }

    public void cut(){
        System.out.println(name + " cutting ");
    }

    public void box(){
        System.out.println(name + " boxing ");
    }


}
