package com.atguigu.facade;

/**
 * 屏幕
 */
public class Screen {

    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("Screen On");
    }

    public void off(){
        System.out.println("Screen off");
    }

    public void up(){
        System.out.println("Screen Up");
    }

    public void down(){
        System.out.println("Screen Down");
    }
    


}
