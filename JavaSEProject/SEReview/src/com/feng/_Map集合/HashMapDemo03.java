package com.feng._Map集合;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * 需求：
 * 键盘输入一个字符串，统计字符出现的次数
 * 思路：
 *     1.键盘录入
 *     2.创建hashMap集合，键是character，值是Integer
 *     3.遍历每一个字符
 *     4.字符作为键到hashMap集合中找对应的值，看其返回值
 *          返回值是null，集合不存在，把该字符作为键，值作为1储存
 *          不是null，集合存在，把该值加一，然后重新储存该字符和对应的值
 *      5.遍历拼接，输出结果
 * */
public class HashMapDemo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

//        HashMap<Character, Integer> hm = new HashMap<>();
        TreeMap<Character, Integer> hm = new TreeMap<>();
        for (int i=0;i<line.length();i++){
            char key = line.charAt(i);

            Integer value = hm.get(key);

            if(value == null){
                hm.put(key,1);
            } else  {
                value ++;
                hm.put(key,value);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for (Character key : keySet) {
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
