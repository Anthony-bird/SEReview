package com.feng._面向对象;
/**
 * 手机类
 *      类名：手机
 *      成员：品牌 （brand）价格（price）
 *      成员方法： 打电话（call）发短信(sendMessage)
 *      */
public class Phone {
    String brand;
    int price;

    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }

}
