package com.feng._继承3;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("露娜");
        System.out.println("------");
        NewPhone np = new NewPhone();
        np.call("露娜");
    }
}
