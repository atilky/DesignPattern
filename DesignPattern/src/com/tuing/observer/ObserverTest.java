package com.tuing.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 觀察者模式
 */
public class ObserverTest {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        Subject subject = new Subject();
        subject.addSub(observer1);
        subject.addSub(observer2);

        subject.notifyObserver("Hi~~Hello world");

        subject.removeSub(observer1);

        subject.notifyObserver("Hi~~Hello world again");


    }

}

//容器
class Subject{
    List<Observer> list = new ArrayList<>();

    //add sub
    public void addSub(Observer observer){
        list.add(observer);
    }

    //remove sub
    public void removeSub(Observer observer){
        list.remove(observer);
    }

    public void notifyObserver(String message){
        for (Observer observer : list) {
            observer.update(message);
        }
    }

}

interface Observer{
        void update(String message);
}

class Observer1 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer1 receive : " + message);
    }
}

class Observer2 implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Observer2 receive : " + message);
    }
}
