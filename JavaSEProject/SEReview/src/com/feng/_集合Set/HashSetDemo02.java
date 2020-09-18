package com.feng._集合Set;

import java.util.HashSet;

public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("露娜", 18);
        Student s3 = new Student("猴子", 22);

        Student s4 = new Student("露娜", 18);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for (Student s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }

}
