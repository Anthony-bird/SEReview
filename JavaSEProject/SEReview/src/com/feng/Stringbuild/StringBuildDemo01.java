package com.feng.Stringbuild;
/**
 * StringBuild:构造对象
 *             创建空白字符对象  可变字符对象
 *             */
public class StringBuildDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb" + sb);
        System.out.println("sb length " + sb.length());

        StringBuilder sb2 = new StringBuilder("hi");
        System.out.println("sb2 " + sb2);
        System.out.println("sb2 length " + sb2.length());

    }
}
