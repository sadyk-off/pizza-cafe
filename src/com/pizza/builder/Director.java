package com.pizza.builder;

import com.pizza.builder.sauces.SauceType;
import com.pizza.builder.types.PizzaType;

public class Director {
    public void constructVeganPizza(Builder builder) {
        builder.setPizzaType(PizzaType.VEGAN_PIZZA);
        builder.setSauceType(SauceType.teriyaki);
    }


}
