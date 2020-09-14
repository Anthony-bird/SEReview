package com.feng._abstract类;
/**
 *  抽象类中不一定有抽象方法，有抽象方法的一定是抽象类
 *  抽象类不能实例化    参照多态的方式进行实例化
 *  */
public abstract class Animal {

    private int age = 20;
    private final String city="北京";

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void show(){
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }
    public abstract void eat();

    public void sleep(){
        System.out.println("睡觉");
    }

}
