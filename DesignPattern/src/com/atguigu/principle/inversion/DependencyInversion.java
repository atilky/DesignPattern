package com.atguigu.principle.inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "電子郵件 : hello world";
    }
}

/**
 * 完成Person接收消息的功能
 * 分析
 * 1. 簡單
 * 2.如果我們要獲取的對象是微信,短信,則要新增class,同時Person也要增加相對應的接收方法
 * 3. 解決方法 : 引入一個抽象接口(IReceive),表示接收者,
 *    當IReceive與Person與發生依賴,因為Email與WeiXin屬於接收的範圍,
 *    他們各自實現接收的範圍,他們各自實現IReceive 接口OK, 這樣就符合依賴倒轉原則
 */
class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}
