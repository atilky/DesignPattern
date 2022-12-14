package com.atguigu.facade;

/**
 * 投影機
 */
public class Projector {

    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Projector ON");
    }

    public void off(){
        System.out.println("Projector off");
    }
    
    public void focus(){
        System.out.println("Projector focus");
    }
    

}
