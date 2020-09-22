package com.feng._集合与文件;

import java.io.*;
/**
 * 复制java文件打印流改进版
 * */
public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
      /*  BufferedReader br = new BufferedReader(new FileReader("SEReview\\PrintStreamDemo.java"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\Copy.java"));

        String line;
        while ((line=br.readLine())!= null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();*/

        BufferedReader br = new BufferedReader(new FileReader("SEReview\\PrintStreamDemo.java"));
        PrintWriter pw = new PrintWriter(new FileWriter("SEReview\\Copy.java"),true);

        String line;
        while ((line=br.readLine())!= null){
            pw.println(line);
        }
        pw.close();
        br.close();
    }
}
