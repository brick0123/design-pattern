package com.example.designpattern.singleton;

/**
 * Lazy Holder (권장)
 * getInstance를 호출할때 이때 Holder의 클래스 초기화 과정이 이루어진다.
 * Holder 클래스가 초기화 되면서 instance 객체의 생성도 이루어지는데, JVM은 클래스 초기화 과정에서 원자성을 보장한다.
 *
 */
public class SingletonV5 {

    private SingletonV5() {

    }

    private static class SingletonHolder {
        private static final SingletonV5 INSTANCE = new SingletonV5();
    }

    public static SingletonV5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
