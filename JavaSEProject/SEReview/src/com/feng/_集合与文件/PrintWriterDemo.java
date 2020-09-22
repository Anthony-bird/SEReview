package com.feng._集合与文件;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 字符打印流
 * */
public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
//        PrintWriter pw = new PrintWriter("SEReview\\pw.txt");

//        pw.write("hello");
//        pw.write("\r\n");
//        pw.flush();
//        pw.write("world");
//        pw.write("\r\n");
//        pw.flush();

//        pw.println("hello");
//        pw.flush();
//        pw.println("world");
//        pw.flush();

        PrintWriter pw = new PrintWriter(new FileWriter("SEReview\\pw.txt"),true);

        pw.println("hello");
        pw.println("world");

        pw.close();
    }
}
