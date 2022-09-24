package com.atguigu.principle.inversion.inmprove;

public class DependencyPass {
    public static void main(String[] args) {

        Datong datong = new Datong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(datong);

        //通過建構傳遞
        Datong2 datong2 = new Datong2();
        OpenAndClose2 openAndClose2 = new OpenAndClose2(datong2);
        openAndClose2.open();

        //通過setting方法進行依賴傳遞
        Datong3 datong3 = new Datong3();
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(datong3);
        openAndClose3.open();


    }
}


/**
 * 方法1 : 通過接口傳遞實現依賴
 */
//開關的接口
interface IOpenAndClose{ public void open(ITV itv); } //抽象方法,接收接口

/**
 * ITV接口
 */
interface ITV{ public void play();}

class Datong implements ITV{ public void play() { System.out.println("大同電視, 打開1"); }}

/**
 * 實現的接口
 */
class OpenAndClose implements IOpenAndClose{ public void open(ITV itv) { itv.play(); }}


/**
 * 方式2:通过构造方法依赖传递
 */
interface IOpenAndClose2 { public void open();}

/**
 * ITV接口
 */
interface ITV2{ public void play();}

class Datong2 implements ITV2{ public void play() { System.out.println("大同電視, 打開2"); }}

class OpenAndClose2 implements IOpenAndClose2{
    public ITV2 tv;
    public OpenAndClose2(ITV2 tv){
        this.tv = tv;
    }

    public void open(){
        this.tv.play();
    }

}

/**
 * 方式3,通过setter方法传递
 */
interface IOpenAndClose3 {
    public void open();//抽象方法
    public void setTv(ITV3 tv);
}

interface ITV3 { // ITV接口
    public void play();
}

class Datong3 implements ITV3{ public void play() { System.out.println("大同電視, 打開3"); }}

class OpenAndClose3 implements IOpenAndClose3{
    private ITV3 tv;

    public void setTv(ITV3 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}
















