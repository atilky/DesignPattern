package com.atguigu.singleton.type4;

public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * 懶漢式(線程安全)
 */
class Singleton{

    /**
     * 1.建構器私有化,外部不能new
     */
    private Singleton(){ }

    private static Singleton instance;

    /**
     * 提供靜態方法,加入同步,解決線程問題
     */
    public static synchronized Singleton getInstance(){
        if(instance == null){
            new Singleton();
        }
        return instance;
    }






}
