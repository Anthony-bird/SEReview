package com.feng._字符流;

import java.io.*;
/**
 * 字符流写
 * */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("SEReview\\osw.txt"));
//        osw.write(97);
//        osw.flush();
//
//        osw.write(98);
//        osw.flush();
//        osw.write(99);

        char[] chs= {'a','b','c','d','e'};
//        osw.write(chs);
//        osw.write(chs,0,chs.length);
//        osw.write(chs,1,3);

//        osw.write("abcde");

//        osw.write("abcde",0,"abcde".length());
        osw.write("abcde",1,3);
        osw.close();

    }
}
