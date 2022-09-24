package com.atguigu.builder.improve;

public class CommonHouse extends HouseBuilder{

    @Override
    public void buildBasic() {
        house.setBasie("普通房子地基 10坪");
        System.out.println("CommonHouse buildBasic");
    }

    @Override
    public void buildWalls() {
        house.setBasie("普通房子水泥牆普通");
        System.out.println("CommonHouse buildWalls");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse roofed");
    }
}
