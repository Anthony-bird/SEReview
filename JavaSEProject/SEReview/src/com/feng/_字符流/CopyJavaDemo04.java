package com.feng._字符流;

import java.io.*;
/**
 * 字符缓冲流 特有功能 复制
 * */
public class CopyJavaDemo04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("SEReview\\ConversionStreamDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\Copy.java"));

        String line;
        while ((line =br.readLine()) != null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
