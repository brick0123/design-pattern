package com.example.designpattern.singleton;

public class SingletonV2 {

    private static SingletonV2 instance;

    private SingletonV2() {

    }

    // 동기화(락)를 이용해서 한번에 하나의 스레드만 접근 가능하도록. 성능상 단점이 있음.
    public static synchronized SingletonV2 getInstance() {
        if (instance == null) {
            instance = new SingletonV2();
        }

        return instance;
    }
}
