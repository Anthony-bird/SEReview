package com.feng._字节流;

import java.io.*;
/**
 * 字节缓冲流
 * */
public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {

       /* BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("SEReview\\bos.txt"));
        bos.write("hello\r\n".getBytes());
        bos.write("world\r\n".getBytes());
        bos.close();*/

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("SEReview\\bos.txt"));
       /* int by;
        while ((by=bis.read())!=-1){
            System.out.print((char) by);
        }
        bis.close();*/

        byte[] bys = new byte[1024];
        int len;

        while ((len = bis.read(bys)) !=-1){
            System.out.println(new String(bys, 0, len));
        }
    }
}
