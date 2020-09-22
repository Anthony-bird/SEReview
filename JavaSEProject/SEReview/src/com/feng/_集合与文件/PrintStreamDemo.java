package com.feng._集合与文件;

import java.io.IOException;
import java.io.PrintStream;
/**
 * 字节打印流
 * */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("SEReview\\ps.txt");

//        ps.write(97);
//        ps.print(97);

        ps.println(97);
        ps.println(98);

        ps.close();
    }
}
