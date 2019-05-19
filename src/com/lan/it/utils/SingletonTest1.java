package com.lan.it.utils;

public class SingletonTest1 {
    public static SingletonTest1 instance;

    private SingletonTest1() {
    }

    public static synchronized SingletonTest1 getInstance() {
        if (instance == null) {
            instance = new SingletonTest1();
        }
        return instance;
    }
}
