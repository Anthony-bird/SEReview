package com.feng._网络09;

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
//        System.out.println(2222222);

//        bw.write("886");
//        bw.newLine();
//        bw.flush();

        s.shutdownOutput();
        //接收反馈
        BufferedReader brClient = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String data = brClient.readLine();
        System.out.println("服务器的反馈:" + data);

        br.close();
        s.close();
    }
}
