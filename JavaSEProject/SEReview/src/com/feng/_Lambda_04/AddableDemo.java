package com.feng._Lambda_04;
/**
 * 抽象方法带参带返回值
 * 真正返回的参数是主方法里面的
 * */
public class AddableDemo {
    public static void main(String[] args) {
        useAddable( (int x,int y)->{
            return x+y;
        });
    }

    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
