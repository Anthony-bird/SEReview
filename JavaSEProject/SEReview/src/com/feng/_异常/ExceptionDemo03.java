package com.feng._异常;

/**
 * try catch
 * */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    private static void method() {
       try {
           int [] arr={1,2,3};
           System.out.println(arr[3]);
       }catch (ArrayIndexOutOfBoundsException e){
           //System.out.println("你访问的数组不存在");
           e.printStackTrace();
       }
    }
}
