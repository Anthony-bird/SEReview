package com.feng._网络07;

import java.io.*;
import java.net.Socket;

/**
 * 客服端：数据来自于文本文件
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("169.254.9.157", 10000);

        BufferedReader br = new BufferedReader(new FileReader("SEReview\\InetAddressDemo.java"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;

        while ((line=br.readLine())!=null){

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        br.close();
        s.close();
    }
}
