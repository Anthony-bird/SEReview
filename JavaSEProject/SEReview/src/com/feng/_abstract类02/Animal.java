package com.feng._abstract类02;
/**
 *  抽象类中不一定有抽象方法，有抽象方法的一定是抽象类
 *  抽象类不能实例化    参照多态的方式进行实例化
 *  */
public abstract class Animal {

    private int age ;
    private String name;

    public Animal() {
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void eat();


}
