package com.example.designpattern.singleton;

/**
 * DCLP (Double-Checked Locking Pattern)
 * 싱글톤을 보장할 수 없다.
 * 실제 메모리에 반영되어있는지 보장할 수 없다. (캐시를 읽을 수 있기 때문)
 * 따라서 volatile 키워드를 이용해서 메모리에 rw를 하도록 해야한다.
 */
public class SingletonV4 {

    private static SingletonV4 instance;
//    private static volatile SingletonV4 instance;

    private SingletonV4() {

    }

    public static SingletonV4 getInstance() {
        if (instance == null) {
            synchronized (SingletonV4.class) {
                if (instance == null) {
                    instance = new SingletonV4();
                }
            }
        }
        return instance;
    }
}
