package com.feng._继承6;

public class Test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("牛魔");
        t.setAge(18);

        System.out.println("名字:"+t.getName()+"年龄:"+t.getAge());
        t.teach();

        Teacher t2 = new Teacher();
        t.setName("嫦娥");
        t.setAge(16);

        System.out.println("名字:"+t.getName()+"年龄:"+t.getAge());
        t.teach();
    }
}
