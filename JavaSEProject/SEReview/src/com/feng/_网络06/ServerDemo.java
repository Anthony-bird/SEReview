package com.feng._网络06;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端：接收的数据写入文本文件
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\s.txt"));
        String line;
        while ((line = br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        ss.close();
    }
}
