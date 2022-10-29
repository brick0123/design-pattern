package com.example.designpattern.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonRunner {

    @Test
    void v1() {
        final SingletonV1 instance = SingletonV1.getInstance();
        assertThat(instance).isSameAs(SingletonV1.getInstance());
    }

    @Test
    @DisplayName("리플렉션을 이용해서 싱글턴을 파괴함")
    void singletone_break() throws Exception {
        final Constructor<SingletonV5> constructor = SingletonV5.class.getDeclaredConstructor();
        constructor.setAccessible(true);

        final SingletonV5 instance = constructor.newInstance();

        assertThat(instance).isNotSameAs(SingletonV5.getInstance());
    }
}
