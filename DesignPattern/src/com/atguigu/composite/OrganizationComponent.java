package com.atguigu.composite;

public abstract class OrganizationComponent {

    private String name;
    private String des; //描述

    public OrganizationComponent(String name, String des) {
        super();
        this.name = name;
        this.des = des;
    }

    protected void add(OrganizationComponent o){
        //默認實現
        throw new UnsupportedOperationException();
    }

    protected void remove(OrganizationComponent o){
        //默認實現
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    //繼承都需要實現
    protected abstract void print();

}
