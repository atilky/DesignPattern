package com.atguigu.facade;

/**
 * 爆米花
 */
public class Popcorn {

    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Popcorn ON");
    }

    public void off(){
        System.out.println("Popcorn off");
    }
    
    public void pop(){
        System.out.println("Popcorn popping");
    }


}
