package com.feng._可变参数;

import java.util.List;
import java.util.Set;
/**
 * arrays工具类 ：  返回的集合不能做增删操作，可以做修改操作
 * List接口：     返回的集合不能做增删改操作
 * Set接口： 定义元素不能重复   返回的集合不能做增删操作，没有修改方法
 * */
public class ArgsDemo02 {
    public static void main(String[] args) {
            //返回由指定数组支持的固定大小列表
//        List<String> list = Arrays.asList("hello", "world", "java");

//        list.add("javaee");  //UnsupportedOperationException
////        list.remove("world");//UnsupportedOperationException
//        list.set(1,"javaee");
//
//        System.out.println(list);

        //返回一个包含任意数量元素的不可变列表
       /* List<String> list = List.of("hello", "world", "java", "world");  //jdk1.9才能用
        list.add("javaee");//UnsupportedOperationException
        list.remove("java");//UnsupportedOperationException
        list.set(1,"javaee");//UnsupportedOperationException
        System.out.println(list);*/

        //返回一个包含任意数量元素的不可变集合
//        Set<String> set = Set.of( "hello", "world", "java", "world"); //非法参数
        /*Set<String> set = Set.of( "hello", "world", "java");

//        set.add("javaee");//UnsupportedOperationException
//        set.remove("world");//UnsupportedOperationException
        System.out.println(set);*/
    }
}
