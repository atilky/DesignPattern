package com.atguigu.observer;

public class YahooObserver implements Observer{

    @Override
    public void update(String message) {
        System.out.println("YahooObserver receive : " + message);
    }

    @Override
    public String toString() {
        return "YahooObserver";
    }
}
