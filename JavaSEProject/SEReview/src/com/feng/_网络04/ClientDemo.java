package com.feng._网络04;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *客户端发送数据，接收服务器反馈
 *    */
public class ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket s = new Socket("169.254.9.157", 10000);

        OutputStream os = s.getOutputStream();
        os.write("hello,tcp,我来了".getBytes());

        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("客服端:" + data);

        s.close();

    }
}
