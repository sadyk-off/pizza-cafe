package com.pizza.builder;

import com.pizza.builder.sauces.SauceType;
import com.pizza.builder.types.PizzaType;

public class Pizza {
    private final PizzaType pizzaType;
    private final SauceType sauceType;

    public Pizza(PizzaType pizzaType, SauceType sauceType) {
        this.pizzaType = pizzaType;
        this.sauceType = sauceType;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }


}
