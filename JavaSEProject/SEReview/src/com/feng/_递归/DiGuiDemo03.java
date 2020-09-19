package com.feng._递归;

import java.io.File;

public class DiGuiDemo03 {
    public static void main(String[] args) {
        File scrFile = new File("E:\\itcast");
        
        getAllFilePath(scrFile);
    }

    public static void getAllFilePath(File scrFile) {
        File[] fileArray = scrFile.listFiles();
        if (fileArray!=null){
            for (File file : fileArray) {
                if (file.isDirectory()){
                    getAllFilePath(file);
                } else {
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }
}
