package com.feng._集合与文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * 集合到文件
 * */
public class ArrayListToTxtDemo {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();
        array.add("hello");
        array.add("world");
        array.add("java");

        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\array.txt"));

        for (String s : array) {
            bw.write(s);
            bw.newLine();
            bw.flush();
        }

        bw.close();
    }
}
