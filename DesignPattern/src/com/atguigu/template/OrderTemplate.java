package com.atguigu.template;

public abstract class OrderTemplate {

    public final void make(){
        getUserId();
        getPageType();
        getGameOrder();
        getGameOrderSum();
        integrateFormat();
    }

    //查詢userId
    private void getUserId(){
        System.out.println("get user id");
    }

    //分業種類
    private void getPageType(){
        System.out.println("get page type");
    }

    //取得各遊戲的注單
    abstract void getGameOrder();

    //取得各遊戲的總和
    abstract void getGameOrderSum();

    //統一前端所需要格式
    private void integrateFormat(){
        System.out.println("integrate format");
    };


}
