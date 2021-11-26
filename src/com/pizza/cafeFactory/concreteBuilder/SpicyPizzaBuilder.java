package com.pizza.cafeFactory.concreteBuilder;

import com.pizza.cafeFactory.builder.PizzaBuilder;

public class SpicyPizzaBuilder extends PizzaBuilder {

    @Override
    public void buildDough() {
        pizza.setDough("thin");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni + salami");
    }
}
