package com.feng._多线程10;

import java.util.*;

/**
 * 线程安全类 StringBuffer  Vector Hashtable
 * */
public class ThreadDemo {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<>();
        ArrayList<String> array = new ArrayList<>();

        Hashtable<String, String> ht = new Hashtable<>();
        HashMap<String, String> hm = new HashMap<>();

        //返回指定列表支持的同步线程安全列表
        List<String> list = Collections.synchronizedList(new ArrayList<String>());


    }
}
