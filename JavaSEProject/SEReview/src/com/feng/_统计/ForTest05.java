package com.feng._统计;

public class ForTest05 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100;i<1000;i++){
            int x= i%10;
            int y= i/10%10;
            int z= i/100;
            if (x*x*x+y*y*y+z*z*z == i)
                count++;
        }
        System.out.println(count);
    }
}
