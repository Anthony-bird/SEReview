package com.feng._逢七过;
/**
 * 需求：
 *     游戏：逢七过
 *     规则：从任意一个数字报数，当你报的数字包含7或者是7的倍数时都要说：过
 *     打印1-100之间的满足逢七必过的规则的数字
 *     思路：
 *         个位是7，十位是七，被七整除*/
public class Test01 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if (i%10==7 || i/10%10 == 7|| i%7 == 0){
                System.out.println(i);
            }
        }
    }
}
