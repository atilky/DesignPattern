package com.atguigu.builder.improve;

/**
 * 指揮者,這裡去指定製造流程
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    /**
     * 建構傳入 houseBuilder
     */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * setting 傳入 houseBuilder
     */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何處理建造房子流程,交給指揮者
     */
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }

}
