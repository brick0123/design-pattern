package com.example.designpattern.prototype;

import java.util.Objects;

public class Person implements Cloneable {

    private Member member;

    private String name;

    public Member getMember() {
        return member;
    }

    public Person(Member member, String name) {
        this.member = member;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(member, person.member) && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(member, name);
    }
}

