package com.feng._Stream流06;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * stream流的收集操作
 * */
public class CollectDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林心如");
        list.add("张曼玉");
        list.add("林青霞");
        list.add("柳岩");

//        Stream<String> listStream = list.stream().filter(s -> s.length() == 3);
//
//        List<String> names = listStream.collect(Collectors.toList());
//        for (String name : names) {
//            System.out.println(name);
//        }
//
       /* HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(33);
        set.add(55);
        Stream<Integer> setStream = set.stream().filter(age -> age > 25);*/

      /*  List<Integer> ages = setStream.collect(Collectors.toList());
        for (Integer age : ages) {
            System.out.println(age);
        }*/

      String[] strArray={"林青霞,30","张曼玉,35","王祖贤,33","柳岩,25"};
        Stream<String> arrayStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 28);

        Map<String, Integer> map = arrayStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        Set<String> keySet=map.keySet();
        for (String key : keySet) {
            Integer value = map.get(key);
            System.out.println(key+","+value);
        }
    }

}
