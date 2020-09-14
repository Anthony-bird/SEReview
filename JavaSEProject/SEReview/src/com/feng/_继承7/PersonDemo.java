package com.feng._继承7;

public class PersonDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("牛魔");
        t.setAge(18);

        System.out.println("名字:"+t.getName()+" 年龄:"+t.getAge());
        t.teach();
    }
}
