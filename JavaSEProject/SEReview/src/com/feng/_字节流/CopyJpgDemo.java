package com.feng._字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 复制照片
 * */
public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\itcast\\1.jpg");
        FileOutputStream fos = new FileOutputStream("SEReview\\1.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read()) !=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
