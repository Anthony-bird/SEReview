package com.feng.三个和尚;

public class OperatorDemo02 {
    public static void main(String[] args) {
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        //用三元运算符获取前两个和尚的较高身高值，并用临时变量保存
        int temp = (height1 > height2)? height1:height2;
        //用三元运算符获取临时身高值与第三个身高进行比较，并用最大身高变量保存
        int max = temp > height3 ? temp:height3;

        System.out.println("max="+max);
    }

}
