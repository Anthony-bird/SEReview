package com.feng._接口03;
/**    猫和狗接口版
* */
public class AnimalDemo {
    public static void main(String[] args) {
        Jumpping j=new Cat();
        j.jump();
        System.out.println("------------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println("------------");

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.jump();
    }
}
