package com.feng._学生;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name + "," + s.age);

        s.name="护花使者";
        s.age=18;
        System.out.println(s.name + "," + s.age);

        s.study();
        s.doHomework();
    }
}
