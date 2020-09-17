package com.feng._集合;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        for (String s : array) {
            System.out.println(s);
        }

        System.out.println("-------");

        LinkedList<String> linklist = new LinkedList<>();
        linklist.add("hello");
        linklist.add("world");
        linklist.add("java");

        for (String s : linklist) {
            System.out.println(s);
        }

    }
}
