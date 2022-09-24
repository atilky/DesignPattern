package com.atguigu.chainofresponseibility;

public abstract class Handler {

    Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    abstract void process(RequestBuyHouse requestBuyHouse);

}
