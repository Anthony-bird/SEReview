package com.feng._构造方法的注意事项;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();

        Student s2 = new Student("佩奇");
        s2.show();

        Student s3 = new Student(18);
        s3.show();

        Student s4 = new Student("佩奇", 18);
        s4.show();

    }
}
