package com.feng._Stream流03;

import java.util.ArrayList;
/**
 * stream流与sort方法
 * */
public class StreamDemo04 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //按照字母顺序
//        list.stream().sorted().forEach(System.out::println);
        //按照字符串长度
//        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);

        list.stream().sorted((s1,s2)->{
            int num = s1.length() - s2.length();
            int num1 = num == 0 ? s1.compareTo(s2) : num;
            return num1;
        }).forEach(System.out::println);
    }
}
