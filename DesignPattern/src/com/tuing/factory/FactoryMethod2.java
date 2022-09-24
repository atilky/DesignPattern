//package com.tuing.factory;
//
//
//public class FactoryMethod2 {
//
//    public static void main(String[] args) {
//
//        Application application = new Application();
//        ProductA productA = application.getObject();
//        productA.method1();
//
//
//    }
//
//
//}
//
//class ProductA2 {
//    public void method1() {
//        System.out.println("ProductA2.method1 executed.");
//    }
//}
//
//
//class Application2 {
//
//    private ProductA2 createProduct(){
//
//        return new ProductA2();
//    }
//
//    ProductA2 getObject(){
//        return createProduct();
//    }
//
//}
