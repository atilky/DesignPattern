package com.atguigu.singleton.type3;

public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * 懶漢式(線程不安全)
 */
class Singleton{

    /**
     * 1.建構器私有化,外部不能new
     */
    private Singleton(){ }

    private static Singleton instance;

    /**
     * 提供靜態方法,當使用到該方法,才去創建
     * 只能在多線程使用
     */
    public static Singleton getInstance(){
        if(instance == null){
            new Singleton();
        }
        return instance;
    }






}
