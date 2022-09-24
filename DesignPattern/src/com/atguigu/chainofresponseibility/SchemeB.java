package com.atguigu.chainofresponseibility;

public class SchemeB extends Handler{

    private final Integer area = 45;
    private final Integer price = 22;
    private final Integer distance = 3;

//    public SchemeB(Handler next) {
//        super(next);
//    }

    @Override
    void process(RequestBuyHouse requestBuyHouse) {
        if (requestBuyHouse.getArea() < this.area ||
            requestBuyHouse.getPrice() > this.price ||
            requestBuyHouse.getDistance() < this.distance) {
            next.process(requestBuyHouse);
        } else {
            System.out.println("SchemeB pass");
        }

    }
}
