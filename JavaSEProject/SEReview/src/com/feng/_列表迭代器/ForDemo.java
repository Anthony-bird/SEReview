package com.feng._列表迭代器;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println("--------");
        String[] strArray = {"hello","world","java"};
        for (String s : strArray) {
            System.out.println(s);
        }

        System.out.println("--------");

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("--------");

        for (String s : list) {            //ConcurrentModificationException
            if (s.equals("world")){
                list.add("javaee");
            }
        }
    }
}
