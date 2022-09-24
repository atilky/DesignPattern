package com.atguigu.composite;

public class Client {

    public static void main(String[] args) {

        //從大到寫創建對象

        //學校
        OrganizationComponent university = new University("清大", "台大");

        //學院
        OrganizationComponent college1 = new College("工科學院", "工科學院相關");

        OrganizationComponent college2 = new College("商科學院", "商科學院相關");

        //創建各個學院下面的系

        //工學院新增科系
        college1.add(new Department("電機系", "高級黑手1"));
        college1.add(new Department("機械系", "高級黑手2"));

        //商學院新增科系
        college2.add(new Department("銀行系", "收銀小姊"));

        //將學院加到學校
        university.add(college1);
        university.add(college2);

        university.print();

    }

}
