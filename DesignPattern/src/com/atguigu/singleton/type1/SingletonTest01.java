package com.atguigu.singleton.type1;

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * 餓漢式(靜態常量)
 */
class Singleton{

    /**
     * 1.建構器私有化,外部不能new
     */
    private Singleton(){

    }

    /**
     * 2.本類 內部創建對象實例
     */
    private final static Singleton instance = new Singleton();

    /**
     * 3.提供一個公有的靜態方法,返回實利對象
     * @return
     */
    public static Singleton getInstance(){
        return instance;
    }

}
