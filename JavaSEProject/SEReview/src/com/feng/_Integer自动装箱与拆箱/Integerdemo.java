package com.feng._Integer自动装箱与拆箱;
/*
* 只要是对象在使用前必须进行不为null的判断
* */
public class Integerdemo {
    public static void main(String[] args) {

        Integer i = Integer.valueOf(100);
        Integer i1 = 100;
        //拆箱

        i1 += 200; //i1= i1.intValue()+200;
        System.out.println(i1);

        Integer iii=null;
        if (iii!= null){
            iii +=300;
        }
        System.out.println(iii);

    }
}
