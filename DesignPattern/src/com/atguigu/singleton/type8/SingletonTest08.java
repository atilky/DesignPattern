package com.atguigu.singleton.type8;

public class SingletonTest08 {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance1);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

enum Singleton{
    INSTANCE;
    public void sayOK(){
        System.out.println("OK~");
    }
}

