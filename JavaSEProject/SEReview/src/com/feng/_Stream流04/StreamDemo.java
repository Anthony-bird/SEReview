package com.feng._Stream流04;

import java.util.ArrayList;
/**
 * stream终洁方法  foreach  count
 * */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        list.stream().forEach(System.out::println);

        long count = list.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);
    }
}
