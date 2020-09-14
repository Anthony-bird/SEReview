package com.feng.duotai03;
/**
 * 向上转型
 * 向下转型
 * */


public class AnimalDemo {
    public static void main(String[] args) {

        Animal a = new Cat();
        a.eat();

        Cat c=  (Cat)a;
        c.playGame();
        c.eat();
    }
}
