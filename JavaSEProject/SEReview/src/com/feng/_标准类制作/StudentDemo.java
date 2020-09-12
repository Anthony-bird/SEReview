package com.feng._标准类制作;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("baby");
        s.setAge(18);
        s.show();

        Student s2 = new Student("baby", 18);
        s2.setName("露娜");
        s2.setAge(18);
        s2.show();
    }
}
