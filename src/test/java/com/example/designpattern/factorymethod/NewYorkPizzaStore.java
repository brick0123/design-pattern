package com.example.designpattern.factorymethod;

public class NewYorkPizzaStore implements PizzaStore {

    private static final String NAME = "new-york";

    @Override
    public Pizza makePizza(String name) {
        if (NAME.equals(name)) {
            return new NewYorkPizza();
        }
        throw new IllegalArgumentException();
    }
}
