package com.feng._Map集合;

import java.util.HashMap;
import java.util.Set;
/**
 * 键是Student，值是string
 * */
public class HashMapDemo02 {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("露娜", 18);
        Student s3 = new Student ("猴子", 22);
        Student s4 = new Student ("猴子", 22);

        hm.put(s1,"西安");
        hm.put(s2,"武汉");
        hm.put(s3,"郑州");
        hm.put(s4,"北京");

        Set<Student> keySet = hm.keySet();
        for (Student key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge()+","+value);
        }
    }
}
