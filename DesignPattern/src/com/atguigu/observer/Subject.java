package com.atguigu.observer;

/**
 * 讓AmericanStock 來實現
 */
public interface Subject {

    /**
     * 觀察者註冊
     */
    void register(Observer observer);

    /**
     * 觀察者取消注冊
     */
    void remove(Observer observer);

    /**
     * 通知觀察者 最新訊息
     */
    void notifyObserver(String message);

}
