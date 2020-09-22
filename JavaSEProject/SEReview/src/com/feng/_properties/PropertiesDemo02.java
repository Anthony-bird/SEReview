package com.feng._properties;

import java.util.Properties;
import java.util.Set;
/**
 * 作为map集合特有方法
 * */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        Properties pop = new Properties();
        /* 底层调用Hashtable put方法*/
        pop.setProperty("aa001","林青霞");
        pop.setProperty("aa002","张曼玉");
        pop.setProperty("aa003","王祖贤");

//        System.out.println(pop.getProperty("aa001"));
//        System.out.println(pop.getProperty("aa0011"));
//
//        System.out.println(pop);

        Set<String> names = pop.stringPropertyNames();
        for (String key : names) {
            String value = pop.getProperty(key);
            System.out.println(key + "," + value);
        }

    }
}
