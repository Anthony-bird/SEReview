package com.feng._Stream流02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.Stream;
/**
 * stream常见流的生成方式
 * */
public class StreamDemo {
    public static void main(String[] args) {
        //collection集合
        ArrayList<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        HashSet<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();

        //map体系
        HashMap<String, Integer> hashMap = new HashMap<>();
        Stream<String> keyStream = hashMap.keySet().stream();
        Stream<Integer> valueStream = hashMap.values().stream();
        Stream<Map.Entry<String, Integer>> entryStream = hashMap.entrySet().stream();

        //数组通过steam接口的静态方法
        String[] strArray= {"hello","world","java"};
        Stream<String> stringArrayStream = Stream.of(strArray);
        Stream<String> stringArrayStream2 = Stream.of("hello","world","java");
        Stream<Integer> intStream = Stream.of(10, 20, 30);

    }
}
