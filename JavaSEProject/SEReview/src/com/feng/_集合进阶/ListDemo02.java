package com.feng._集合进阶;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

//        list.add(1,"javaee");
//        list.add(11,"javaee");//索引越界
        //System.out.println(list);
        System.out.println(list.remove(1));
//        System.out.println(list.remove(11));//索引越界

        System.out.println(list.set(1, "javaee"));
//        System.out.println(list.set(11, "javaee"));//索引越界

        System.out.println(list.get(1));
//        System.out.println(list.get(11));

        System.out.println(list);
        for (int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
