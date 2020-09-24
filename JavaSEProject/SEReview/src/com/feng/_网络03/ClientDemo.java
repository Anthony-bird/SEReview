package com.feng._网络03;

import java.io.IOException;

import java.io.OutputStream;
import java.net.Socket;

/**
 * TCP发送数据的步骤
 *    1、创建socket对象
 *    2.获取流，写入数据
 *    3.释放资源
 *    */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
//        Socket s = new Socket(InetAddress.getByName("169.254.9.157"), 10000);

        Socket s = new Socket("169.254.9.157", 10000);

        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        s.close();

    }
}
