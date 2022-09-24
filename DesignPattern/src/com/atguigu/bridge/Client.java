package com.atguigu.bridge;

public class Client {

    public static void main(String[] args) {

        Phone phone1 = new FoldedPhone(new XiaoMi());
        phone1.open();
        phone1.call();

        Phone phone2 = new FoldedPhone(new Vivo());
        phone2.open();

    }
}
