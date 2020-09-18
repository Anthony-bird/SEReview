package com.feng._集合Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<>();

        ls.add("hello");
        ls.add("world");
        ls.add("java");
        //不包含重复元素
        ls.add("world");

        for (String s : ls) {
            System.out.println(s);
        }
    }
}
