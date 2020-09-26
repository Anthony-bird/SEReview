package com.feng._Stream流03;

import java.util.ArrayList;
/**
 * map &  mapToInt
 * */
public class StreamDemo05 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //集合字符串转化为整数
//        list.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);

//        list.stream().map(Integer::parseInt).forEach(System.out::println);

//        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        //返回流元素的总和
        int result = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);
    }
}
