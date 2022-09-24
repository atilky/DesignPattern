package com.atguigu.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.美股相關訊息
 * 2.含有觀察者的集合
 * 3.update時, 會通知所有的觀察者
 */
public class AmericanStock implements Subject {

    private Integer dji; //道瓊
    private Integer nasdaq; //納斯達克
    private Integer sox; //費半

    public AmericanStock(Integer dji, Integer nasdaq, Integer sox) {
        this.dji = dji;
        this.nasdaq = nasdaq;
        this.sox = sox;
    }

    public AmericanStock() { }

    public Integer getDji() {
        return dji;
    }

    public void setDji(Integer dji) {
        this.dji = dji;
    }

    public Integer getNasdaq() {
        return nasdaq;
    }

    public void setNasdaq(Integer nasdaq) {
        this.nasdaq = nasdaq;
    }

    public Integer getSox() {
        return sox;
    }

    public void setSox(Integer sox) {
        this.sox = sox;
    }

    public void upDataData(Integer dji, Integer nasdaq, Integer sox){
        this.dji = dji;
        this.nasdaq = nasdaq;
        this.sox = sox;
        System.out.println("U.S. stock upData");
        //通知觀察者
        notifyObserver(this.toString());
    }

    private List<Observer> observerS = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        System.out.println(observer.toString() + " register U.S. stock message");
        observerS.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        System.out.println(observer.toString() + " remove U.S. stock message");
        observerS.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer observer: observerS) {
            observer.update(message);
        }
    }

    @Override
    public String toString() {
        return "U.S. stock index now " +
                "  dji = " + dji +
                ", nasdaq = " + nasdaq +
                ", sox = " + sox ;
    }
}
