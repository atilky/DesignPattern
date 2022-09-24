package com.atguigu.prototype.shallowcopy;

/**
 * 使用原型模式
 */
public class Client {

    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("小羊", "白色", 15);
        sheep1.friendSheep = new Sheep("friendSheep", "black", 30);
        Sheep sheep2 = (Sheep)sheep1.clone();

        //如果真的有複製出來,會有一個記憶體位置
        System.out.println(sheep1.hashCode()); //1163157884
        System.out.println(sheep2.hashCode()); //1956725890

        //
        System.out.println(sheep1.friendSheep.hashCode()); //356573597
        System.out.println(sheep2.friendSheep.hashCode());

        System.out.println(sheep1.friendSheep);
        System.out.println(sheep2.friendSheep);


    }
}
