package com.tuing.facde;

public class FacadeTest {

    public static void main(String[] args) {
        Client1 client1 = new Client1();
        client1.doSomething();
    }


}

class Client1 {

    Facade f1 = new Facade();

    public void doSomething(){
        f1.doAllThing();
    }

}

class client2{

}

class Facade{

    SubSystem1 s1 = new SubSystem1();
    SubSystem2 s2 = new SubSystem2();
    SubSystem3 s3 = new SubSystem3();

    public void doAllThing(){
        s1.method();
        s2.method();
        s3.method();
    }

}



class SubSystem1 {
    public void method(){
        System.out.println("subSystem1 method executed");
    }
}
class SubSystem2 {
    public void method(){
        System.out.println("subSystem2 method executed");
    }
}
class SubSystem3 {
    public void method(){
        System.out.println("subSystem3 method executed");
    }
}
