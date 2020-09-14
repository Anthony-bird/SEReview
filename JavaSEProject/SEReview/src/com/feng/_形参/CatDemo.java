package com.feng._形参;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat c = new Cat();
        co.userCat(c);

        Cat c2 = co.getCat();
        c2.eat();
    }
}
