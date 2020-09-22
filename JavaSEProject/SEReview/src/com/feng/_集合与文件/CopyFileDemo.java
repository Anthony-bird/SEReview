package com.feng._集合与文件;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 复制文件的异常处理
 * */
public class CopyFileDemo {
    public static void main(String[] args) {

    }

    /*private static void method4() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");
        try(fr;fw) {                        //1.8之后版本才有效
            char[] chs = new char[1024];
            int len;
            while ((len=fr.read(chs))!= -1){
                fw.write(chs,0,len);
            }
        } catch (IOException e){
            e.printStackTrace();
        }

    }*/

    private static void method3()  {
        try(FileReader fr = new FileReader("fr.txt");
            FileWriter fw = new FileWriter("fw.txt");) {
            char[] chs = new char[1024];
            int len;
            while ((len=fr.read(chs))!= -1){
                fw.write(chs,0,len);
            }
         } catch (IOException e){
                e.printStackTrace();
         }

    }

    private static void method2()  {
        FileReader fr = null;
        FileWriter fw = null;
       try {
           fr = new FileReader("fr.txt");
           fw = new FileWriter("fw.txt");

           char[] chs = new char[1024];
           int len;
           while ((len=fr.read(chs))!= -1){
               fw.write(chs,0,len);
           }

       }catch (IOException e){
            e.printStackTrace();
       }finally {
           if (fw!=null){
               try {
                   fw.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
           if (fr!=null){
               try {
                   fr.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }


       }

    }

    private static void method1() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");

        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!= -1){
            fw.write(chs,0,len);
        }

        fw.close();
        fr.close();
    }
}
