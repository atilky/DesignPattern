package com.atguigu.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特
 * 有一个学校，下属有各个学院和总部，现要求打印出学校总部员工ID和学院员工的id
 */
public class Demeter {

    public static void main(String[] args) {
        //創建一個SchoolManage
        SchoolManage schoolManage = new SchoolManage();
        //輸出學院員工id 跟 學校總部的員工id
        schoolManage.printAllEmployee(new CollegeManage());
    }
}


/**
 * 學校總部員工 類
 */
class Employee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 學院員工類
 */
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

/**
 * 管理 學院員工的管理類
 */
class CollegeManage{
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<CollegeEmployee>();
        for (int i = 0; i < 10; i++) {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("學院員工id = " + i);
            list.add(emp);
        }
        return list;
    }
}

/**
 * 學校管理類
 * 類的直接朋友 Employee(成員變量) CollegeManage(方法參數)
 * CollegeEmployee不是直接朋友(已經關聯到兩層了), 違反Demeter原則
 */
class SchoolManage {
    public List<Employee> getAllEmployee(){
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 5; i++) {
            Employee emp = new Employee();
            emp.setId("學校總部員工id = " + i);
            list.add(emp);
        }
        return list;
    }

    void printAllEmployee(CollegeManage sub){

        /**
         * 問題
         * 1.CollegeEmployee 不是直接朋友
         * 2.CollegeEmployee 是以局部變量方式出現
         *
         * 3.对于被依赖的类不管多么复杂，都尽量将逻辑封装在类的内部。对外除了提供的public 方法，不对外泄露任何信息
         */
        List<CollegeEmployee> listEmployee = sub.getAllEmployee();
        System.out.println("---學院員工---");
        for (CollegeEmployee employee: listEmployee) {
            System.out.println(employee.getId());
        }

        List<Employee> listEmployee2 = this.getAllEmployee();
        System.out.println("---學校總部員工---");
        for (Employee employee: listEmployee2) {
            System.out.println(employee.getId());
        }
    }
}

