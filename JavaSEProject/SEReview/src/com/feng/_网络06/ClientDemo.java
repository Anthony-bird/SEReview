package com.feng._网络06;

import java.io.*;
import java.net.Socket;

/**
 * 客服端：数据来自于键盘录入  886结束
 * */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("169.254.9.157", 10000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

        String line;

        while ((line=br.readLine())!=null){
            if ("886".equals(line)){
                break;
            }

            bw.write(line);
            bw.newLine();
            bw.flush();
        }

        s.close();
    }
}
