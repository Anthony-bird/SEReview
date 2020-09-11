package com.feng._百钱买白鸡;
/**
* 需求：
 *    百钱买百鸡 ：鸡翁一值钱五，鸡母一值前三，鸡雏三值钱一
 *    问各多少值*/
public class Test05 {
    public static void main(String[] args) {
        for (int x=0;x<=20;x++){
            for (int y=0;y<=33;y++){
                int z=100-x-y;
             if (z%3 ==0 && 5*x+3*y+z/3 == 100){
                 System.out.println("鸡翁"+x+"鸡母"+y+"鸡雏"+z);
                }
            }
        }
    }
}
