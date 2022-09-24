package com.atguigu.builder.improve;

/**
 * 抽象的建造者
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 將建造的流程寫成抽象方法
     */
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    /**
     * 建造房子完後後,將產品(房子)return
     */
    public House buildHouse(){
        return house;
    }

}
