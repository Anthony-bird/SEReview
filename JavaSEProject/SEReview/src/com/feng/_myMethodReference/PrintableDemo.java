package com.feng._myMethodReference;
/**
 * 体验方法符引用
 * */
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable( (String s)->{
            System.out.println(s);
        });

        usePrintable((s -> System.out.println(s)));

        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p) {
        p.printString("love money");
    }
}
