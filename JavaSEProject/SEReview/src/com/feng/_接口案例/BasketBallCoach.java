package com.feng._接口案例;

public class BasketBallCoach extends Coach {
    @Override
    public void teach() {
        System.out.println("篮球教练教如何运球和投篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃羊肉，喝羊奶");
    }
}
