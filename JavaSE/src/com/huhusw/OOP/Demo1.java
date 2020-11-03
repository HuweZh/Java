package com.huhusw.OOP;

/**
 * @Author huhusw
 * @Date 2020/11/3
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);// 1
        Demo1.change(1);
        System.out.println(a);// 1


        Student student = new Student();
        System.out.println(student.name);  //  null
        Demo1.change(student);
        System.out.println(student.name);  //  小明
    }

    public static void change(int a){
        a = 10;
    }

    public static void change(Student student){
        student.name = "小明";
    }
}
