package com.atguigu.principle.ocp;

/**
 * 開閉原則
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

}

/**
 * 這是一個繪製圖形的類(使用方)
 */
class GraphicEditor {
    //接收shape對象,然後根據type,來繪製不同的圖形
    public void drawShape(Shape s) {
        switch (s.m_type){
            case 1 :
                drawRectangle(s);
                break;
            case 2 :
                drawCircle(s);
                break;
            case 3 :  //新增一個繪製三角類的方法,在使用方如果更動,違反OCP原則
                drawTriangle(s);
                break;
        }

    }

    public void drawRectangle(Shape r){
        System.out.println("畫正方形");
    }

    public void drawCircle(Shape r){
        System.out.println("畫圓形");
    }

    //新增一個繪製三角類的方法,在使用方如果更動,違反OCP原則
    public void drawTriangle(Shape r){
        System.out.println("畫三角形");
    }
}

class Shape {
    int m_type;
}

class Rectangle extends Shape{
    Rectangle(){
        super.m_type = 1;
    }
}


class Circle extends Shape {
    Circle(){
        super.m_type = 2;
    }
}

class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}


