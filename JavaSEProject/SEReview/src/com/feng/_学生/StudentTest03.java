package com.feng._学生;
/**
 * 多个对象指向相同
 * */
public class StudentTest03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="紫霞仙子";
        s1.age=18;

        System.out.println(s1.name + "," + s1.age);
        Student s2 = s1;
        s2.name="美猴王";
        s2.age=20;
        System.out.println(s1.name + "," + s1.age);
        System.out.println(s2.name + "," + s2.age);
    }
}
