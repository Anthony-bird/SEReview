package com.feng._形参抽象类;

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Animal a = new Cat();
        ao.userAnimal(a);

        Animal a2 = ao.getAnimal();
        a2.eat();
    }
}
