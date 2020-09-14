package com.feng._形参接口类;

public class JumppingOperator {
    public void useJumpping(Jumpping j){
        j.jump();
    }

    public Jumpping getJumpping(){
        Jumpping j = new Cat();
        return j;
    }
}
