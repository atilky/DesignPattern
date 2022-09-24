package com.atguigu.observer;

public class GoogleObserver implements Observer{

    @Override
    public void update(String message) {
        System.out.println("GoogleObserver receive : " + message);
    }

    @Override
    public String toString() {
        return "GoogleObserver";
    }
}
