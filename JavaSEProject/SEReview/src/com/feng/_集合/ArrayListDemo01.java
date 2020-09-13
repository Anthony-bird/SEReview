package com.feng._集合;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        //ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        System.out.println(array);

        array.add("hello");
        array.add("java");
        array.add("world");

        array.add(1,"javaSE");

        System.out.println("s"+array);
    }
}
