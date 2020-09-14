package com.feng._static;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university ="清北";

        Student s1 = new Student();
        s1.name="噜啦";
        s1.age=63;
       // s1.university="清华大学";
        s1.show();

        Student s2 = new Student();
        s2.name="王武";
        s2.age=16;
        //s2.university="清华大学";
        s2.show();

    }
}
