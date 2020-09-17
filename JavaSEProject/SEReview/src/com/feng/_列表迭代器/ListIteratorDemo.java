package com.feng._列表迭代器;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args)  {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit = list.listIterator();
        /*while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("----------------");
        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }*/

        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("world")) {
                list.add("javaee");
            }
        }
        System.out.println(list);
    }
}
