package com.feng._myMethodReference_04;
/**
 * 引用对象实例方法
 * */
public class PrinterDemo {
    public static void main(String[] args) {
//        usePrinter( (String s)->{
//            String result = s.toUpperCase();
//            System.out.println(result);
//        });

        usePrinter(s -> System.out.println(s.toUpperCase()));

        //引用对象实例方法
        PrintString ps = new PrintString();
        usePrinter(ps::PrintUpper);
    }
    private static void usePrinter(Printer p){
        p.printUpperCase("HelloWorld");
    }
}
