package com.feng.珠穆朗玛峰;
/**
 * 珠峰高度8844.43米=8844430毫米 假如我有一张足够大的纸，他的厚度是0.1毫米
 * 请问我折叠多少次，可以折叠成珠峰的高度
 * ？*/
public class WhileTest {
    public static void main(String[] args) {
        int count = 0;
        double paper =0.1;
        double  zf = 8844430;
        while (paper <= zf){
            paper *=2;
            count++;
        }
        System.out.println(count);
    }
}
