# 面向对象OOP

## 面向对象

### 面向过程

按照顺序，为实现功能，第一步做什么，第二部做什么....是一个线性思维

### 面向对象

分类的思维模式，不同的对象负责不同的功能。适合处理复杂的问题，适合多人协作的问题

面向对象分析整个系统，面向过程实现功能

以类的方式组织代码，以对象的组织（封装）数组

**抽象**

从认识论角度考虑是先有对象后有类，类是对对象的抽象

从代码运行角度来看是先有类才有对象

## 方法回顾和加深

### 静态方法和非静态方法

```java
public class Student {
    // 类实例化后才存在，需要使用对象进行调用
    public void say() {
        System.out.println("我是学生");
    }

    //静态方法，和类一起加载的，直接使用类名即可调用
    public static void speak() {
        System.out.println("我也是学生");
    }
}
```

### 值传递和引用传递

java都是值传递

```java
public class Demo1 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);// 1
        Demo1.change(1);
        System.out.println(a);// 1
    }
    
    public static void change(int a){
        a = 10;
    }
}
```

**引用传递：对象，本质还是值传递**

```java
public class Demo1 {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);  //  null
        Demo1.change(student);
        System.out.println(student.name);  //  小明
    }

    public static void change(Student student){
        student.name = "小明";
    }
}

```

学生类

```java
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
```



## 对象的创建分析

## 面向对象的三大特性

### 封装

### 继承

### 多态

## 抽象类和接口

## 内部类和OOP实战

