package com.atguigu.prototype.improve;

/**
 * 使用原型模式
 */
public class Client {

    public static void main(String[] args) {
       Sheep sheep1 = new Sheep("小羊", "白色", 15);
       Object sheep2 = sheep1.clone();
       Object sheep3 = sheep1.clone();
       Object sheep4 = sheep1.clone();

        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3.hashCode());
        System.out.println(sheep4.hashCode());
        System.out.println(sheep1 == sheep4);
        System.out.println(sheep1.equals(sheep4));

    }
}
