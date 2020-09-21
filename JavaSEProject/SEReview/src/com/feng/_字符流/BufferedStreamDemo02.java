package com.feng._字符流;

import java.io.*;

/**
 * 字符流缓冲流特有功能
 * */
public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
       /* BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\bw.txt"));

        for (int i=0;i < 10;i++){
            bw.write("hello"+i);
//            bw.write("\r\n");
            bw.newLine();
            bw.flush();
        }

        bw.close();*/

        BufferedReader br = new BufferedReader(new FileReader("SEReview\\bw.txt"));

        String line;
        while ((line=br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
