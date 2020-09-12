package com.feng._学生2;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("小可爱");
        s.setAge(18);
        s.show();

        //使用get方法获得成员变量的值
        System.out.println(s.getName() + "---" + s.getAge());
        System.out.println(s.getName() + "," + s.getAge());
    }
}
