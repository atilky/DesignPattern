package com.atguigu.chainofresponseibility;

//購買房子的請求
public class RequestBuyHouse {

    private Integer area;//面積 要大於50坪
    private Integer price;//價錢  1坪要小於15萬
    private Integer distance; //公司距離  不能超過10公厘

    public RequestBuyHouse(Integer area, Integer price, Integer distance) {
        this.area = area;
        this.price = price;
        this.distance = distance;
    }

    public Integer getArea() {
        return area;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getDistance() {
        return distance;
    }




}
