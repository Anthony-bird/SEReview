package com.feng._Map集合;

import java.util.HashMap;

public class MapDemo02 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

//        System.out.println(map.remove("郭靖"));
//        System.out.println(map.remove("郭襄"));

//        map.clear();

//        System.out.println(map.containsKey("郭靖"));
//        System.out.println(map.containsKey("郭襄"));

        System.out.println(map.isEmpty());

        System.out.println(map.size());

        System.out.println(map.containsValue("小龙女"));

        System.out.println(map);
    }
}
