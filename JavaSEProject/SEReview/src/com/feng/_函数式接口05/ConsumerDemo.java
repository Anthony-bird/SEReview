package com.feng._函数式接口05;

import java.util.function.Consumer;
/**
 * Consumer消费型接口
 * */
public class ConsumerDemo {
    public static void main(String[] args) {
//        opratorString("林青霞",(String s)->{
//            System.out.println(s);
//        });

        opratorString("林青霞",s->System.out.println(s));
//        opratorString("林青霞",System.out::println);

//        opratorString("林青霞",s->{
//            System.out.println(new StringBuilder(s).reverse().toString());
//        });

        opratorString("林青霞",s->System.out.println(new StringBuilder(s).reverse().toString()));
        System.out.println("---------");

        opratorString("林青霞",s-> System.out.println(s),s->System.out.println(new StringBuilder(s).reverse().toString()));
    }

    private static void opratorString(String name, Consumer<String> con1,Consumer<String> con2) {
//        con1.accept();
//        con2.accept();
        con1.andThen(con2).accept(name);
    }

    private static void opratorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}
