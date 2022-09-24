package com.atguigu.prototype.improve;

public class Sheep implements Cloneable{

    String name;
    String color;
    int age;

    public Sheep(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }


    /**
     * clone 該實例,使用默認的clone方法來完成
     * 也可以在這邊客製深拷貝
     */
    @Override
    protected Object clone() {

        Sheep sheep = null;

        try {
            sheep = (Sheep)super.clone();
        }catch (Exception e){
            System.out.println("clone fail");
        }

        return sheep;
    }
}
