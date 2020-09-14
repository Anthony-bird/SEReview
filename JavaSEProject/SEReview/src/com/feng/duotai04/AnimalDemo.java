package com.feng.duotai04;

public  class AnimalDemo {
    public static void main(String[] args) {
        Animal c = new Cat();
        c.setName("加菲");
        c.setAge(18);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();

        Animal c1 = new Cat("加菲", 18);
        System.out.println(c1.getName() + "," + c1.getAge());
        c1.eat();
    }
}
