package com.pizza.cafeFactory;

import com.pizza.cafeFactory.concreteBuilder.HawaiianPizzaBuilder;

public class Demo {
    public static void main(String[] args) {
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        hawaiianPizzaBuilder.getPizza().getDough();

    }
}
