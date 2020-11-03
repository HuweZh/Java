package com.huhusw.OOP;

/**
 * @Author huhusw
 * @Date 2020/11/3
 */
public class Student {
    public String name;
    // 类实例化后才存在
    public void say() {
        System.out.println("我是学生");
    }

    //静态方法，和类一起加载的
    public static void speak() {
        System.out.println("我也是学生");
    }
}
