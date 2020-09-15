package com.feng._匿名内部类02;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOpetator jo = new JumppingOpetator();
        Jumpping j = new Cat();
        jo.method(j);

        Jumpping j2 = new Dog();
        jo.method(j2);

        System.out.println("-------------");

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");
            }
        });
    }
}
