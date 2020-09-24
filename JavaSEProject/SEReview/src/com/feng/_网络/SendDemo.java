package com.feng._网络;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/**
 * UDP发送数据
 *   1.创建发送端Socket对象
 *   2.创建数据打包
 *   3.调用发送数据
 *   4.关闭
 *   */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();

        byte[] bys = "hello,udp我来了".getBytes();
        DatagramPacket dp = new DatagramPacket(bys,bys.length, InetAddress.getByName("169.254.9.157"),10086);

        ds.send(dp);

        ds.close();

    }
}
