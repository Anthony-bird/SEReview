package com.feng._接口案例;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(30);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.study();
        ppp.speak();
        System.out.println("----------");

        BasketballPlayer bbp = new BasketballPlayer();
        bbp.setName("姚明");
        bbp.setAge(35);
        System.out.println(bbp.getName() + "," + bbp.getAge());
        ppp.eat();
        ppp.study();
    }
}
