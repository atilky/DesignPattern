package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    //List中存放的是Department
    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    //重寫add
    @Override
    protected void add(OrganizationComponent organizationComponent){
        //將來實際業務中,College的add 和 University add不一定相同
        organizationComponents.add(organizationComponent);
    }

    //重寫remove
    @Override
    protected void remove(OrganizationComponent organizationComponent){
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    //print方法,就是輸出University 包含的學院
    @Override
    protected void print() {
        System.out.println("---" + getName() + "---");

        for (OrganizationComponent o:  organizationComponents) {
            o.print();
        }
    }

}
