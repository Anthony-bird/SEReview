package com.feng._字符流;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 字符流复制java文件 进阶版
 * */
public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("SEReview\\ConversionStreamDemo.java");
        FileWriter fw = new FileWriter("SEReview\\Copy.java");

       /* int ch;
        while ((ch=fr.read()) != -1){
            fw.write(ch);
        }*/

        char[] chs = new char[1024];
        int len;
        while ((len = fr.read(chs))!=-1){
            fw.write(chs, 0, len);
        }

        fw.close();
        fr.close();
    }
}
