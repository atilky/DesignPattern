package com.atguigu.builder.old;

public abstract class AbstractHouse {

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌牆
     */
    public abstract void buildWalls();

    /**
     * 蓋屋頂
     */
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }

}
