package com.atguigu.principle.uml.aggregation;

/**
 * 聚合關係(Aggregation)
 */
public class Computer {

    private Keyboard keyboard; //keyboard 可以跟 Computer 分離
    private Mouse mouse; //keyboard 可以跟 Computer 分離

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

}
