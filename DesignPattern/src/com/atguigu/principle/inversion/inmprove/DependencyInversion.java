package com.atguigu.principle.inversion.inmprove;

/**
 * 依賴倒轉
 */
public class DependencyInversion {
    public static void main(String[] args) {
        //客戶端不需要改變
        Person person = new Person();
        person.receive(new Email());

        person.receive(new WeiXin());
    }
}

//定義一個接口 IReceive
interface IReceive{
    public String getInfo();
}

class Email implements IReceive{
    public String getInfo(){
        return "電子郵件 : hello world";
    }
}

class WeiXin implements IReceive{
    public String getInfo(){
        return "微信 : hello world";
    }
}

/**
 * 方式2
 *
 */
class Person{
    //這裡我們對接口的依賴
    public void receive(IReceive iReceive){
        System.out.println(iReceive.getInfo());
    }
}
