package com.atguigu.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * University 就是Composite,可以管理College
 */
public class University extends OrganizationComponent{

    List<OrganizationComponent> organizationComponents = new ArrayList<OrganizationComponent>();

    public University(String name, String des) {
        super(name, des);
    }

    //重寫add
    @Override
    protected void add(OrganizationComponent organizationComponent){
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
