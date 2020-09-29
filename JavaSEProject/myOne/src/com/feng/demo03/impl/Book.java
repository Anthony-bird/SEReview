package com.feng.demo03.impl;

import com.feng.demo03.MyService;

public class Book implements MyService {

    @Override
    public void service() {
        System.out.println("好好看书，才有好工作");
    }
}
