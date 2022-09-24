package com.atguigu.builder.improve;

public class HighBuilding extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println(" HighBuilder buildBasic");
    }

    @Override
    public void buildWalls() {
        System.out.println(" HighBuilder buildWalls");
    }

    @Override
    public void roofed() {
        System.out.println(" HighBuilder roofed");
    }
}
