package com.feng._properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 与IO流相结合的方法
 * */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        myStore();

        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("SEReview\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.put("aa001","林青霞");
        prop.put("aa002","张曼玉");
        prop.put("aa003","王祖贤");

        FileWriter fw = new FileWriter("SEReview\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
