package com.feng._泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<>();

        c.add("hello");
        c.add("java");
        c.add("world");
//        c.add(12);

//        Iterator it = c.iterator();
        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);

            String s = it.next();
            System.out.println(s);  //ClassCastException:
        }
    }
}
