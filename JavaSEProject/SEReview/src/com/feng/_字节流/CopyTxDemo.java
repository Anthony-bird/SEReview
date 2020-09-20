package com.feng._字节流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 字节流复制文本文件
 * */
public class CopyTxDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\itcast\\小说.txt");
        FileOutputStream fos = new FileOutputStream("SEReview\\小说.txt");

        int by;
        while ((by = fis.read()) !=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }
}
