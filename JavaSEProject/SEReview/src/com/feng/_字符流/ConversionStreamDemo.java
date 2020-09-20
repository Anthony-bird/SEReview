package com.feng._字符流;

import java.io.*;
/**
 * 字符流编码与解码问题
 * */
public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("SEReview\\osw.txt"));
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("SEReview\\osw.txt"),"UTF-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("SEReview\\osw.txt"),"GBK");

        osw.write("中国");
        osw.close();

//        InputStreamReader isr = new InputStreamReader(new FileInputStream("SEReview\\osw.txt"), "UTF-8");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("SEReview\\osw.txt"), "GBK");
        int ch;
        while ((ch= isr.read())!= -1){
            System.out.print((char) ch);
        }

        isr.close();
    }
}
