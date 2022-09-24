package com.atguigu.singleton.type7;

public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * 靜態內部類
 * 靜態內部類的特點:
 *  1.當類裝載時,靜態類內部類不會裝載
 *  2.被調用時,才會裝載,並且只會裝載一次
 *  3.類的靜態屬性只會在第一次加載類的時候初始化，所以在這裡，JVM幫助我們
 * 保證了線程的安全性，在類進行初始化時，別的線程是無法進入
 */
class Singleton{

    /**
     * 1.建構器私有化,外部不能new
     */
    private Singleton(){ }

    private static volatile Singleton instance;

    /**
     * 寫一個靜態內部類,該類中有一個靜態屬性Singleton
     */
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 提供靜態公用方法,直接返回SingletonInstance.INSTANCE
     * @return
     */
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }










}
