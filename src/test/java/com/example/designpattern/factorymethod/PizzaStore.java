package com.example.designpattern.factorymethod;

public interface PizzaStore {

    default Pizza order(String name) {
        final Pizza pizza = makePizza(name);
        pizza.prepare();
        return pizza;
    }

    Pizza makePizza(String name);
}
