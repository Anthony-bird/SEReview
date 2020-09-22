package com.feng._集合与文件;

public class Student01 {
    private String name;
    private int Chinese;
    private int math;
    private int English;

    public Student01() {
    }

    public Student01(String name, int chinese, int math, int english) {
        this.name = name;
        Chinese = chinese;
        this.math = math;
        English = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return Chinese;
    }

    public void setChinese(int chinese) {
        Chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getSum(){
        return this.Chinese+this.math+this.English;
    }
}
