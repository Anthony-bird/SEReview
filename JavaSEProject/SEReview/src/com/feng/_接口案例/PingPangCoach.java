package com.feng._接口案例;

public class PingPangCoach extends Coach implements SpeakEnglish {
    @Override
    public void teach() {
        System.out.println("乒乓球教练教如何发球和接球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃小白菜,喝大米粥");
    }

    @Override
    public void speak() {
        System.out.println("乒乓球教练说英语");
    }
}
