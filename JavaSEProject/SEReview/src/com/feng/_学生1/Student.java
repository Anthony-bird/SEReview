package com.feng._学生1;
/**
 * 学生类
 * */
public class Student {
    String name;
//    int age;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0 || age>120){
            System.out.println("你给的年龄有误");
        } else {
            this.age = age;
        }
    }

    //成员方法
    public void show(){
        System.out.println(name + "," + age);
    }

}
