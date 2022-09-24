package com.atguigu.facade;

public class Client {

    public static void main(String[] args) {

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        //準備
        homeTheaterFacade.ready();
        //播放
        homeTheaterFacade.play();
        //暫停
        homeTheaterFacade.pause();
        //結束
        homeTheaterFacade.end();

    }
}
