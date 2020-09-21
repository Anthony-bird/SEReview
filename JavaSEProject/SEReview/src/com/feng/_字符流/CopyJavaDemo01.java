package com.feng._字符流;

import java.io.*;
/**
 * 字符流复制java文件
 * */
public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("SEReview\\ConversionStreamDemo.java"));
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("SEReview\\Copy.java"));

       /* int ch;
        while ((ch=isr.read()) != -1){
            osw.write(ch);
        }*/

        char[] chs = new char[1024];
        int len;
        while ((len = isr.read(chs))!=-1){
            osw.write(chs, 0, len);
        }

        osw.close();
        isr.close();
    }
}
