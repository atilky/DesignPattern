package com.atguigu.chainofresponseibility;

public class SchemeA extends Handler{

    private final Integer area = 55;//55坪
    private final Integer price = 35;//35萬
    private final Integer distance = 7; //7公里

    @Override
    void process(RequestBuyHouse requestBuyHouse) {
        if (requestBuyHouse.getArea() < this.area ||
                requestBuyHouse.getPrice() > this.price ||
                requestBuyHouse.getDistance() < this.distance) {
            next.process(requestBuyHouse);
        } else {
            System.out.println("SchemeA pass");
        }


    }
}
