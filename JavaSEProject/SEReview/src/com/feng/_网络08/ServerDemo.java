package com.feng._网络08;

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
        BufferedWriter bw = new BufferedWriter(new FileWriter("SEReview\\Copy.java"));
        String line;
        while ((line = br.readLine())!=null){
//            if ("886".equals(line)){
//                break;
//            }
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        System.out.println(11111);
        //反馈
        BufferedWriter bwServer = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        bw.close();
        ss.close();
    }
}
