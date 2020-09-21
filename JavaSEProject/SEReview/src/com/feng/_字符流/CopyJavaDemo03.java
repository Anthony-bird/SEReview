package com.feng._字符流;

import java.io.*;

/**
 * 字符缓冲流复制java文件  进阶版
 * */
public class CopyJavaDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("SEReview\\ConversionStreamDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\Copy.java"));

         /* int ch;
        while ((ch=br.read()) != -1){
            bw.write(ch);
        }*/


        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs))!=-1){
            bw.write(chs, 0, len);
        }

        bw.close();
        br.close();
    }
}
