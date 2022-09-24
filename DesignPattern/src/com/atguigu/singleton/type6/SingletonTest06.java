package com.atguigu.singleton.type6;

public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1.equals(instance2));
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}

/**
 * double check
 */
class Singleton{

    /**
     * 1.建構器私有化,外部不能new
     */
    private Singleton(){ }

    private static volatile Singleton instance;

    /**
     * 提供靜態方法,雙重檢查,解決線程安全問題,同時解決lazy loading問題
     * 推薦使用
     */
    public static  Singleton getInstance(){
        if(instance == null){
            synchronized(Singleton.class){
                if(instance == null){
                    new Singleton();
                }
            }
        }
        return instance;
    }






}
