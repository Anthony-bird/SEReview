package com.feng._集合Set;

import com.feng._集合案例.Student;

public class HashDemo {
    public static void main(String[] args) {
        Student s1 = new Student("林青霞", 30);

        //同一个对象多次调用hashCode方法返回的哈希值是相同的
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
        System.out.println("------------");

        Student s2 = new Student("林青霞", 30);
        //默认情况下，不同对象哈希值是不同的
        //通过方法重写，实现不同对象哈希值是相同的
        System.out.println(s2.hashCode());
        System.out.println("------------");

        System.out.println("hello".hashCode());
        System.out.println("world".hashCode());
        System.out.println("java".hashCode());

        System.out.println("world".hashCode());
        System.out.println("------------");

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
    }
}
