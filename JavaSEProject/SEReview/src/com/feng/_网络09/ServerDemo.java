package com.feng._网络09;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端：接收的数据写入文本文件
 * 多线程实现多文件上传
 * */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10000);

        while (true){
            Socket s = ss.accept();
            //为每一客服端开启一个线程
            new Thread(new ServerThread(s)).start();
        }


    }
}
