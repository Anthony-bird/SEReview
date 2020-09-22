package com.feng._对象序列化;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 * 对象序列化流
 * */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SEReview\\oos.txt"));
        Student s = new Student("林青霞",30);

        oos.writeObject(s);

        oos.close();
    }
}
