package com.example.designpattern.factorymethod;

public class ChicagoPizzaStore implements PizzaStore {

    private static final String NAME = "chicago";

    @Override
    public Pizza makePizza(String name) {
        if (NAME.equals(name)) {
            return new ChicagoPizza();
        }
        throw new IllegalArgumentException();
    }
}
