package com.feng._字符流;

import java.io.*;

/**
 * 字符缓冲流使用
 * */
public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
       /* BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\bw.txt"));
        bw.write("hello\r\n");
        bw.write("world\r\n");
        bw.close();*/

        BufferedReader br = new BufferedReader(new FileReader("SEReview\\bw.txt"));
         /* int ch;
        while ((ch=br.read()) != -1){
            fw.write(ch);
        }*/

        char[] chs = new char[1024];
        int len;
        while ((len = br.read(chs))!=-1){
            System.out.println(new String(chs, 0, len));
        }
        br.close();

    }
}
