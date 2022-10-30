package com.example.designpattern.factorymethod;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@DisplayName("팩토리 메서드 패턴")
public class FactoryClient {

    @Test
    void chicago() {
        final PizzaStore pizzaStore = new ChicagoPizzaStore();

        final Pizza chicago = pizzaStore.makePizza("chicago");

        assertThat(chicago).isInstanceOf(ChicagoPizza.class);
    }

    @Test
    void new_york() {
        final PizzaStore pizzaStore = new NewYorkPizzaStore();

        final Pizza newYork = pizzaStore.makePizza("new-york");

        assertThat(newYork).isInstanceOf(NewYorkPizza.class);
    }

    @Test
    @DisplayName("존재하지 않는 피자에는 예외가 발생한다.")
    void not_support() {
        final PizzaStore pizzaStore = new NewYorkPizzaStore();

        assertThatThrownBy(() -> pizzaStore.makePizza("hawaiian"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
