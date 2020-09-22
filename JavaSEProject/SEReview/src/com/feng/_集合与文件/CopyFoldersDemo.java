package com.feng._集合与文件;

import java.io.*;
/**
 * 复制多级文件
 * */
public class CopyFoldersDemo {
    public static void main(String[] args) throws IOException{
        File srcFile = new File("E:\\itcast");
        File destFile = new File("F:\\");

        copyFolder(srcFile,destFile);
    }

    private static void copyFolder(File srcFile, File destFile) throws IOException {
        if (srcFile.isDirectory()){
            String srcFileName = srcFile.getName();
            File newFolder = new File(destFile, srcFileName);
            if (!newFolder.exists()){
                newFolder.mkdir();
            }

            File[] fileArray = srcFile.listFiles();
            for (File file : fileArray) {
                copyFolder(file,newFolder);
            }
        } else{
            File newFile = new File(destFile, srcFile.getName());
            copyFile(srcFile, newFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
