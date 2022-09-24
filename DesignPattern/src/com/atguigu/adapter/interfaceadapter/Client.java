package com.atguigu.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {

        AbsAdapter adapter = new AbsAdapter() {
            /**
             * 只需要去覆蓋我們需要使用的接口
             */
            @Override
            public void m1() {
                System.out.println("使用m1的方法");
            }
        };

    }
}
