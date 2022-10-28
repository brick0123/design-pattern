package com.example.designpattern.singleton;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonRunner {

    @Test
    void v1() {
        final SingletonV1 instance = SingletonV1.getInstance();
        assertThat(instance).isSameAs(SingletonV1.getInstance());
    }
}
