package com.feng._形参抽象类;

public class AnimalOperator {
    public void userAnimal(Animal a){
        a.eat();
    }
    public Animal getAnimal(){
        Animal a = new Cat();
        return a;
    }
}
