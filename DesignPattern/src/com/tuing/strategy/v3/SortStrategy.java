package com.tuing.strategy.v3;

import java.util.*;

public class SortStrategy {

    public static void main(String[] args) {
        Student student1 = new Student("aaa", 15, 175);
        Student student2 = new Student("bbb", 16, 160);
        Student student3 = new Student("ccc", 14, 168);

        List<Student> studentS = new ArrayList<>();
        studentS.add(student1);
        studentS.add(student2);
        studentS.add(student3);

        studentS.sort(new SortByAge());
        System.out.println(studentS);


    }

}

class Student {

    String name ;
    int age ;
    int height ;

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}

class SortByAge implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.age > o2.age){
            return 1;
        } else if (o1.age < o2.age){
            return -1;
        }
        return 0;
    }
}

class SortByHeight implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.height > o2.height){
            return 1;
        } else if (o1.height < o2.height){
            return -1;
        }
        return 0;
    }
}


