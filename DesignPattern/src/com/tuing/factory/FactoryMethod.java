package com.tuing.factory;

/**
 * 工廠模式
 * 先找出穩定跟不穩定的method
 */
public class FactoryMethod {

    public static void main(String[] args) {

//        Application application = new Application();
//        Product productA = application.getObject("B");
//        productA.method1();

//        Product p1 = new ProductA();
//        p1.method1();

        Application application = new concreteProductA();
        Product productA = application.createProduct();
        productA.method1();


    }


}

interface Product {
    void method1();
}

class ProductA implements Product{
    //假設method1是穩定的部分
    public void method1() {
        System.out.println("ProductA.method1 executed.");
    }
}

class ProductB implements Product{
    //假設method1是穩定的部分
    public void method1() {
        System.out.println("ProductB.method1 executed.");
    }
}

class SimpleFactory{
    public static Product createProduct(String type){
        if("A".equals(type)){
            return new ProductA();
        } else if("B".equals(type)){
            return new ProductB();
        }
        return null;
    }
}

//class Application {
//
//    private Product createProduct(String type){
////        return new ProductA();
//        return SimpleFactory.createProduct(type);
//    }
//
//    Product getObject(String type){
//        return createProduct(type);
//    }
//
//}

abstract class Application {
    abstract Product createProduct();
}

class concreteProductA extends Application{
    @Override
    ProductA createProduct() {
        return new ProductA();
    }
}

class concreteProductB extends Application{
    @Override
    ProductB createProduct() {
        return new ProductB();
    }
}



