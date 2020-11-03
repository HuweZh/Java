package com.huhusw;

import java.util.Scanner;

/**
 * @Author huhusw
 * @Date 2020/11/3
 */
public class HelloWorld {
    // 实例变量
    int age;
    String name;

    // 类变量
    static int s;
    static final double PI = 3.14;

    public static void main(String[] args) {
        // 局部变量，必须声明和初始化值
        int a = 0;

        //使用实例变量
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.age);

        // 使用类变量
        System.out.println(HelloWorld.s);

        // 声明数组，声明了一个10个元素的数组，推荐
        int[] arr1 = new int[10];
        // 声明数组，声明了一个10个元素的数组，不推荐，c/c++风格
        int arr2[] = new int[10];

        // 静态初始化，创建和赋值
        int[] array1 = {1, 2, 1, 2, 1, 2, 5, 1};
        for (int num : array1) {
            System.out.println(num);
        }
        // 动态初始化，赋值在别处
        int[] array2 = new int[10];

        // 一维数组
        int[] array = {1, 2, 3, 4, 5, 6};
        // 二维数组
        int[][] arrayarr = {{1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
    }

    public int add() {
        // 定义scnner对象
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            // 获取下一个输入的字符串，回车结束
            String next = scanner.next();
        }
        // 不使用时关闭此对象
        scanner.close();


        return 0;
    }

    //可变参数
    public void add(int... arr) {

    }

    public int sum(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res += num;
        }
        return res;
    }

    public int[] get() {
        return new int[10];
    }
}
