package com.feng._Map集合;

import java.util.HashMap;
import java.util.Set;

public class MapDemo04 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key+","+value);
        }
    }
}
