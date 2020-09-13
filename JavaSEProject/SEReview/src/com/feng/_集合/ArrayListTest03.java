package com.feng._集合;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 需求：
 *     创建学生对象集合 ，使用程序控制台遍历该集合学生姓名和年龄来自于键盘录入
 *  思路：
 *       定义学生类
 *       创建集合对象
 *       键盘录入
 *       创建学生对象
 *       添加学生到集合
 *       遍历
 *       */
public class ArrayListTest03 {
    public static void main(String[] args) {
        ArrayList<Student1> array = new ArrayList<>();
        addList(array);
        addList(array);
        addList(array);

        for (int i=0;i<array.size();i++){
            Student1 s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }

    }
    public static void addList(ArrayList<Student1> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        Student1 s = new Student1();
        s.setName(name);
        s.setAge(age);

        array.add(s);
    }
}
