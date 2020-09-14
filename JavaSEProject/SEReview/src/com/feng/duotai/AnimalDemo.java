package com.feng.duotai;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        System.out.println(a.age);

       // System.out.println(a.weight);

        a.eat();
//        a.playgamr();  //多态执行看左边

    }
}
