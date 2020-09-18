package com.feng._集合Set;
/**
 * TreeSet集合特点
 *        1.元素有序
 *        2.没有带索引的方法 ，不能使用普通for循环
 *        3.不包含重复的元素
 *        */
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts.add(30);
        for (Integer i : ts) {
            System.out.println(i);
        }
    }
}
