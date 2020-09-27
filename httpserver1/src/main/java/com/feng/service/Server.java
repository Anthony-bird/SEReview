package com.feng.service;

import com.feng.date.Data;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * 服务监听
 * */
public class Server implements Runnable{
    //监听的端口
    private int port;

    public Server(int port){
        this.port=port;
    }
    public void run() {
        //线程的主程序
        //申明ServerSocket对象
        ServerSocket serverSocket =null;
        try {
            serverSocket  = new ServerSocket(port);
            System.out.println("开始监听...");
            while (Data.isRun){ //在服务器允许的情况下循环监听端口
                Socket socket = serverSocket.accept();
                System.out.println("接收到请求...");
                //将socket交给RequestExecute处理
                RequestExecute re = new RequestExecute(socket);
                re.start();
            }
            //运行到这 程序要停止 关闭
            serverSocket.close();
            serverSocket=null;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("端口"+port+"监听失败"+e.getMessage());
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8088);
        //启动线程
        new Thread(server).start();
    }
}
