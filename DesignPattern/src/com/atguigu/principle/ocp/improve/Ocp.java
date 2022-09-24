package com.atguigu.principle.ocp.improve;

/**
 * 開閉原則(改進)
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Pentagon());
    }

}

/**
 * 這是一個繪製圖形的類(使用方)
 */
class GraphicEditor {
    //接收shape對象,然後根據type,來繪製不同的圖形
    //使用方不需要修改,由繼承Shape(提供方)拓展出去後做修改
    public void drawShape(Shape shape){
        shape.draw();
    }
}

abstract class Shape {
    int m_type;
    public abstract void draw(); //抽象方法
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("畫正方形");
    }
}


class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("畫圓形");
    }
}

class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("畫三角形");
    }
}

class Pentagon extends Shape{

    @Override
    public void draw() {
        System.out.println("畫五角形");
    }
}


