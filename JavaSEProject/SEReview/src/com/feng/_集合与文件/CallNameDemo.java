package com.feng._集合与文件;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
/**
 * 点名器
 * */
public class CallNameDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("SEReview\\names.txt"));
        ArrayList<String> array = new ArrayList<>();


        String line;
        while ((line =br.readLine()) != null){
            array.add(line);
        }


        br.close();
        Random r = new Random();
        int index = r.nextInt(array.size());

        String name = array.get(index);
        System.out.println("幸运者是:" + name);
    }
}
