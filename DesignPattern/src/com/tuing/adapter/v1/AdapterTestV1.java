package com.tuing.adapter.v1;

public class AdapterTestV1 {

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Integer output = adaptee.output();
        System.out.println(" 原始數據 : " + output);

        Adapter adapter1 = new Adapter();
        adapter1.setAdaptee(adaptee);
        Integer output1 = adapter1.output();
        System.out.println(" 輸出數據 : " + output1);

        Adapter adapter2 = new Adapter(adaptee);
        Integer output2 = adapter2.output();
        System.out.println(" 輸出數據 : " + output2);

    }

}

class Adaptee{
    public Integer output(){
        return 220;
    }
}

interface Target {
    Integer output();
}

class Adapter implements Target{

    private Adaptee adaptee;

    public Adapter() {
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public Integer output() {
        Integer output = adaptee.output();
        return output/10;
    }
}