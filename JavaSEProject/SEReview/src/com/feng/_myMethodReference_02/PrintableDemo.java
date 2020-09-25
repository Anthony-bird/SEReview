package com.feng._myMethodReference_02;
/**
 * 方法引用符*/
public class PrintableDemo {
    public static void main(String[] args) {
        usePrintable( s-> System.out.println(s));

        usePrintable(System.out::println);
    }

    private static void usePrintable(Printable p) {
        p.printInt(666);
    }
}
