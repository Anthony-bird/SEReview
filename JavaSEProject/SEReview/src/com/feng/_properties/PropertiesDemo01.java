package com.feng._properties;

import java.util.Properties;
import java.util.Set;
/**
 * properties作为map集合的使用
 * */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("aa001","林青霞");
        prop.put("aa002","张曼玉");
        prop.put("aa003","王祖贤");

        Set<Object> keySet = prop.keySet();
        for (Object key : keySet) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }

    }
}
