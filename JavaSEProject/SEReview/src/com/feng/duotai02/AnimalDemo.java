package com.feng.duotai02;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator a = new AnimalOperator();

        Cat c = new Cat();
        a.useAnimal(c);

        Dog d = new Dog();
        a.useAnimal(d);

        Pig p = new Pig();
        a.useAnimal(p);
    }
}
