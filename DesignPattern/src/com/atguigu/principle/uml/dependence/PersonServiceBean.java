package com.atguigu.principle.uml.dependence;

/**
 * 依賴關係 範例
 */
public class PersonServiceBean {

    private PersonDao personDao; //類的成員屬性

    //方法接收的參數類型
    public void save(Person person){

    }

    //方法的返回類型
    public IDCard getIDCard(Integer personId){
        return null;
    }

    //方法中使用到
    public void modify(){
        Department department = new Department(); //違反demeter法則
    }

}
