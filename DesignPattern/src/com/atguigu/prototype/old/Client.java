package com.atguigu.prototype.old;

public class Client {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("小羊", "白色", 15);
        Sheep sheep2 = new Sheep(sheep1.getName(), sheep1.getColor(), sheep1.getAge());
        Sheep sheep3 = new Sheep(sheep1.getName(), sheep1.getColor(), sheep1.getAge());
        Sheep sheep4 = new Sheep(sheep1.getName(), sheep1.getColor(), sheep1.getAge());
        Sheep sheep5 = new Sheep(sheep1.getName(), sheep1.getColor(), sheep1.getAge());

        System.out.println(sheep1 == sheep4);
        System.out.println(sheep1.equals(sheep4));

    }
}
