package com.feng._集合;

import java.util.ArrayList;

/**
 * 集合储存字符串并遍历
 * */
public class ArrayListTest01 {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> list = new ArrayList<>();
        //往集合中添加字符串对象
        list.add("老王");
        list.add("老李");
        list.add("老赵");
        //遍历集合
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
        //获取长度
        System.out.println(list.size());
        //遍历集合的通用格式
        for (int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
