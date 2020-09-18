package com.feng._Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo05 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        map.put("杨过","小龙女");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + "," + value);
        }
    }
}
