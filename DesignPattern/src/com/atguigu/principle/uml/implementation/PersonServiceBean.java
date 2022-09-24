package com.atguigu.principle.uml.implementation;

public class PersonServiceBean implements PersonService {
    @Override
    public void delete(Integer id) {
        System.out.println("實現刪除:" + id);
    }
}
