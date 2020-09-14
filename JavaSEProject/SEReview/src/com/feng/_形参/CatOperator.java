package com.feng._形参;

public class CatOperator {
    public void userCat(Cat c){
        c.eat();
    }

    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}
