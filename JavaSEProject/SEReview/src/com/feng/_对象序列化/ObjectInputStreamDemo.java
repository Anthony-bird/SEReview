package com.feng._对象序列化;

import java.io.*;
/**
 * 对象反序列化流
 * */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SEReview\\oos.txt"));

        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();

    }
}
