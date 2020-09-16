package com.feng._异常;
/*throwable成员方法
* */
public class ExceptionDemo04 {
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

           // e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
