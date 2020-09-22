package com.feng._集合与文件;

import java.io.*;
/**
 * 复制单级文件
 * */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("E:\\itcast");

        String srcFolderName = srcFolder.getName();

        File destFolder = new File("SEReview",srcFolderName);

        if (!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] listFiles = srcFolder.listFiles();
        for (File srcFile : listFiles) {
            String srcFileName = srcFile.getName();
            File destFile = new File(destFolder, srcFileName);
            copyFile(srcFile,destFile);
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
