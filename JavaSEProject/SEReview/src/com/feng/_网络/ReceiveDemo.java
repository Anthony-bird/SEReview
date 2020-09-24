package com.feng._网络;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
/**
 * UDP接收数据
 *   1.创建接收端Socket对象
 *   2.创建数据打包
 *   3.调用接收数据
 *   4.解析数据包，并把数据在控制台显示
 *   5.关闭*/

public class ReceiveDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(10086);

        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys, bys.length);
        ds.receive(dp);

//        byte[] datas = dp.getData();
//        int len = dp.getLength();
//        String dataString = new String(datas,0,len);
        System.out.println("数据是：" + new String(dp.getData(),0,dp.getLength()));

        ds.close();
    }
}
