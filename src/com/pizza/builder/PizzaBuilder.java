package com.pizza.builder;

import com.pizza.builder.sauces.SauceType;
import com.pizza.builder.types.PizzaType;

public class PizzaBuilder implements Builder{
    private PizzaType type;
    private SauceType sauceType;

    @Override
    public void setPizzaType(PizzaType type) {
        this.type = type;
    }

    @Override
    public void setSauceType(SauceType sauceType) {
        this.sauceType = sauceType;
    }

    public Pizza getResult() {
        return new Pizza(type, sauceType);
    }
}
