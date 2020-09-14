package com.feng._继承8;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.setName("加菲猫");
        c.setAge(5);

        System.out.println(c.getName() + "," + c.getAge());
        c.catchMouse();

        Cat c2 = new Cat("加菲猫", 5);
        System.out.println(c2.getName() + "," + c2.getAge());
        c2.catchMouse();
    }
}
