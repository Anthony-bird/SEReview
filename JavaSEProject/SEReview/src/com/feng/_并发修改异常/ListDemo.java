package com.feng._并发修改异常;

import java.util.ArrayList;

import java.util.List;

/**
 * 并发修改异常
 * */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("hello");
        list.add("world");
        list.add("java");

        /*Iterator<String> it = list.iterator();
        while (it.hasNext()) {            //ConcurrentModificationException
            String s = it.next();
            if (s.equals("world")){
                list.add("javaee");
            }
        }*/

        for (int i=0;i<list.size();i++){
            String s = list.get(i);
            if (s.equals("world")){
                list.add("javaee");
            }
        }

        System.out.println(list);
    }
}
