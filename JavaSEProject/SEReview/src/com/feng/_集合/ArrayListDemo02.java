package com.feng._集合;

import java.util.ArrayList;
/**
 * arrayList 常用方法
 * */
public class ArrayListDemo02 {
    public static void main(String[] args) {
        //ArrayList<String> array = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("java");
        array.add("world");

       // System.out.println(array.remove("java"));
       // System.out.println(array.remove("javaee"));

       // System.out.println(array.remove(1));

        //System.out.println(array.set(1, "javaSE"));

        System.out.println(array.get(0));
      //  System.out.println(array.get(3)); 索引越界异常

        System.out.println(array.size());
        System.out.println("s"+array);
    }
}
