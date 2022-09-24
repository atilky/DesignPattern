package com.atguigu.builder.old;

public class CommonHouse extends AbstractHouse{
    @Override
    public void buildBasic() {
        System.out.println("CommonHouse打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("CommonHouse砌牆");
    }

    @Override
    public void roofed() {
        System.out.println("CommonHouse蓋屋頂");
    }
}
