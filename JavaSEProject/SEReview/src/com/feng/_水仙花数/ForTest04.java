package com.feng._水仙花数;
/**
 * 求水仙花数 1000以内的水仙花数*/
public class ForTest04 {
    public static void main(String[] args) {
        for (int i = 100;i<1000;i++){
            int x = i/100;
            int y = i/10%10;
            int z = i%10;
            if (x*x*x+y*y*y+z*z*z == i) System.out.println(i);
        }
    }
}
