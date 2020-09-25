package com.feng._Lambda_05;

/**
 * lambda表达式的省略模式
 * */
public class AddableDemo {
    public static void main(String[] args) {
//        useAddable( (int x,int y)->{
//            return x+y;
//        });

        useAddable( (x,y)->{    //参数的类型可以省略，有多个参数的情况下，不能省略一个参数
            return x+y;
        });

//        userFlyable((s)->{
//            System.out.println(s);
//        });

        userFlyable(s->{       //如果参数有且仅有一个，那么小括号也可以省略
            System.out.println(s);
        });

        userFlyable(s-> System.out.println(s)); //如果代码只有一条语句，分号和大括号可以省略
        useAddable((x,y)-> x + y);
    }

    private static void userFlyable(Flyable f){
        f.fly("风和日丽，晴空万里");
    }
    private static void useAddable(Addable a) {
        int sum = a.add(10, 20);
        System.out.println(sum);
    }
}
