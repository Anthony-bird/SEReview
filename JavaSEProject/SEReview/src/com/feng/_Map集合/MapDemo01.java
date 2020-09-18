package com.feng._Map集合;

import java.util.HashMap;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("aa001","林青霞");
        map.put("aa002","露娜");
        map.put("aa003","猴子");
        map.put("aa003","柳岩"); //覆盖

        System.out.println(map);
    }
}
