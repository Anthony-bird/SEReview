package com.feng._集合Set;

import java.util.HashSet;
import java.util.Set;
/**
 * Set集合特点：
 *       不重复，没有带索引的方法，不能使用普通for循环
 *  HashSet：对集合的迭代顺序不作任何保证
 *  */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("hello");
        set.add("world");
        set.add("java");
        //不包含重复元素
        set.add("world");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
