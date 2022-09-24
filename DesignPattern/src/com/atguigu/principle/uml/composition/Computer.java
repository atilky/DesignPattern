package com.atguigu.principle.uml.composition;

/**
 * 組合關係(Composition)
 */
public class Computer {

    private Keyboard keyboard = new Keyboard(); //keyboard 不可以跟 Computer 分離
    private Mouse mouse = new Mouse(); //keyboard 不可以跟 Computer 分離

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

}
