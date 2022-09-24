package com.atguigu.chainofresponseibility;

public class SchemeC extends Handler{

    private final Integer area = 44;
    private final Integer price = 25;
    private final Integer distance = 9;

//    public SchemeC(Handler next) {
//        super(next);
//    }


    @Override
    void process(RequestBuyHouse requestBuyHouse) {

        if (requestBuyHouse.getArea() < this.area ||
                requestBuyHouse.getPrice() > this.price ||
                requestBuyHouse.getDistance() < this.distance) {
            next.process(requestBuyHouse);
        } else {
            System.out.println("SchemeC pass");
        }
    }
}
