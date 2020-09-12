package com.feng._学生2;

/**
 * 解决局部变量隐藏成员变量
 *
 * 面向对象三大特征：封装，继承，多态
 *     封装好处：通过方法控制成员变量的操作，提高代码的安全性
 *     把代码用方法进行封装，提高了代码的复用性
 *     */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //name = name;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //age=age;
        this.age = age;
    }
    public void show(){
        System.out.println(name + "," + age);
    }

}
