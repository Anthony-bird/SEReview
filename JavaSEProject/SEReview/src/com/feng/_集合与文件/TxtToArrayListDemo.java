package com.feng._集合与文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/**
 * 文件到集合
 * */
public class TxtToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("SEReview\\array.txt"));

        ArrayList<String> array = new ArrayList<>();

        String line;
        while ((line =br.readLine()) != null){
          array.add(line);
        }

       
        br.close();

        for (String s : array) {
            System.out.println(s);
        }
    }
}
