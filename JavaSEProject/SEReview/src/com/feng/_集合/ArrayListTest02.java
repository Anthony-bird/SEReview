package com.feng._集合;

import java.util.ArrayList;

/**
 * 需求：
 *       创建一个储存学生对象的集合，储存3个学生对象，使用程序实现在控制台遍历该集合
 *  思路:
 *     创建集合对象
 *     创建学生对象
 *     添加学生对象到集合
 *     遍历集合
 *     */
public class ArrayListTest02 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("玛丽",18);
        Student s2 = new Student("杰克",16);
        Student s3 = new Student("川普",1);
        array.add(s1);
        array.add(s2);
        array.add(s3);

        for (int i =0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
