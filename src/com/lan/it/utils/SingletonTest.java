package com.lan.it.utils;

public class SingletonTest {
    public static final SingletonTest instance = new SingletonTest();

    private SingletonTest() {

    }

    public static synchronized SingletonTest getInstance() {

        return instance;
    }
}
