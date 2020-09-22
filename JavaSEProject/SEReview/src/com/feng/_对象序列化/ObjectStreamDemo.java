package com.feng._对象序列化;

import java.io.*;
/**
 * 序列化UID和关键字修辞
 * */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SEReview\\oos.txt"));

        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s.getName() + "," + s.getAge());

        ois.close();

    }

    public static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("SEReview\\oos.txt"));

        Student s = new Student("林青霞",30);

        oos.writeObject(s);

        oos.close();
    }
}
