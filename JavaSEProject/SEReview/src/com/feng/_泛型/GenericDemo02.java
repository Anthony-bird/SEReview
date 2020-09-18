package com.feng._泛型;

import java.util.ArrayList;
import java.util.List;
/**
 * 类型通配符  <?>
 * */
public class GenericDemo02 {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();
        System.out.println("----------");

        //类型通配符上限  及其子类
//        List<? extends Number> list4 = new ArrayList<Object>();
        List<? extends Number> list5 = new ArrayList<Number>();
        List<? extends Number> list6 = new ArrayList<Integer>();
        System.out.println("----------");

        //类型通配符下限  及其父类
        List<? super Number> list4 = new ArrayList<Object>();
        List<? super Number> list7 = new ArrayList<Number>();
//        List<? super Number> list8 = new ArrayList<Integer>();
    }
}
