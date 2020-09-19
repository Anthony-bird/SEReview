package com.feng._字节流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("SEReview\\fos.txt");
        fos.write(97);
//        fos.write(57);
//        fos.write(55);

        fos.close(); //释放资源
    }
}
