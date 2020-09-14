package com.feng._abstract类02;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.setName("加菲");
        a.setAge(5);
        a.eat();
        System.out.println(a.getName() + "," + a.getAge());

        Animal a2=new Cat(5,"加菲");
        a2.eat();
        System.out.println(a2.getName() + "," + a2.getAge());

        System.out.println("--------");
        Animal a3=new Dog(5,"金毛");
        a3.eat();
        System.out.println(a3.getName() + "," + a3.getAge());
    }
}
