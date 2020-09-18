package com.feng._Map集合;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
       HashMap<String, Student> hm = new HashMap<>();

       Student s1 = new Student("林青霞", 30);
       Student s2 = new Student("露娜", 18);
       Student s3 = new Student ("猴子", 22);

        hm.put("aa001",s1);
        hm.put("aa002",s2);
        hm.put("aa003",s3);

        Set<String> keySet = hm.keySet();
        for (String key : keySet) {
            Student value = hm.get(key);
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
        System.out.println("---------");

        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        for (Map.Entry<String, Student> me : entrySet) {
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key + "," + value.getName() + "," + value.getAge());
        }
    }
}
