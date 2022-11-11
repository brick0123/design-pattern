package com.example.designpattern.prototype;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Main {

    @Test
    @DisplayName("객체 내부의 참조를 그대로 복사한다 (shallow copy)")
    void t1() throws CloneNotSupportedException {
        // given
        final Member member = new Member("han");
        final Person person = new Person(member, "a");

        // when
        final Person clone = (Person) person.clone();

        // then
        assertThat(person.getMember()).isSameAs(clone.getMember());
    }

    @Test
    @DisplayName("복사한 객체 자체는 deep copy를 진행한다")
    void t2() throws CloneNotSupportedException {
        // given
        final Member member = new Member("han");
        final Person person = new Person(member, "a");

        // when
        final Person clone = (Person) person.clone();

        // then
        assertThat(person).isNotSameAs(clone);
        assertThat(person).isEqualTo(clone);
    }
}
