package com.example.designpattern.singleton;

/**
 * eager initialization
 * 동기화를 제거하고 미리 초기화를 한다.
 * 객체를 사용하지 않더라도 인스턴스를 생성하기 떄문에 불필요한 비용이 발생할 수 있다. (생성 시간, 메모리...)
 */
public class SingletonV3 {

    private static final SingletonV3 INSTANCE = new SingletonV3();

    private SingletonV3() {

    }

    public static SingletonV3 getInstance() {
        return INSTANCE;
    }
}
