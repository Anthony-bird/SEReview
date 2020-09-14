package com.feng._继承4;
/**
 *方法重写注意事项
 *   public >默认 >私有           私有方法不能被重写，子类方法不能比父类方法更低
 *   */
public class Zi extends Fu {
//    @Override
//    private void show(){
//        System.out.println("Fu中的show方法被调用");
//    }

    /*@Override
    public void method(){
        System.out.println("Zi的method方法被调用");
    } */

    @Override
    public void method(){
        System.out.println("Zi的method方法被调用");
    }
}
