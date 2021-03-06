package com.feng._Stream流03;

import java.util.ArrayList;
/**
 * limit skip
 * */
public class StreamDemo02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //取前三个元素
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("-------");
//        跳过三个元素
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("-------");

        list.stream().skip(2).limit(2).forEach(System.out::println);
        System.out.println("-------");

    }
}
