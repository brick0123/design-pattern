package com.example.designpattern.singleton;

/**
 * 멀티 스레드 환경에서 안전 X
 */
public class SingletonV1 {

    private static SingletonV1 instance;

    private SingletonV1() {

    }

    public static SingletonV1 getInstance() {
        if (instance == null) {
            instance = new SingletonV1();
        }

        return instance;
    }
}
