package com.feng._网络;

import java.net.InetAddress;
import java.net.UnknownHostException;
886
/**
 * InetAddress
 * */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        InetAddress address = InetAddress.getByName("DESKTOP-A0791HI");
        InetAddress address = InetAddress.getByName("169.254.9.157");
        String name = address.getHostName();

        String ip = address.getHostAddress();

        System.out.println("主机名：" + name);
        System.out.println("IP地址：" + ip);
    }
}
