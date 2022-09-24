package com.atguigu.singleton.type2;

public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * 餓漢式(靜態代碼塊)
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
    private final static Singleton instance ;

    static {  //在靜態代碼模塊中,創建單例對象
        instance = new Singleton();
    }


    /**
     * 3.提供一個公有的靜態方法,返回實利對象
     * @return
     */
    public static Singleton getInstance(){
        return instance;
    }

}
