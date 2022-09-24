package com.atguigu.observer;

public class Client {

    public static void main(String[] args) {

        //創建美股資訊
        AmericanStock americanStock = new AmericanStock();

        //創建觀察者
        YahooObserver yahooObserver = new YahooObserver();
        GoogleObserver googleObserver = new GoogleObserver();

        //觀察者註冊美股相關資訊
        americanStock.register(yahooObserver);
        americanStock.register(googleObserver);

        //美股資訊更新
        americanStock.upDataData(35215, 1569, 2258);

        //yahoo 取消註冊
        americanStock.remove(yahooObserver);

        //美股資訊更新
        americanStock.upDataData(38000, 1599, 2300);



    }

}
