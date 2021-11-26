package com.pizza.builder;

import com.pizza.builder.sauces.SauceType;
import com.pizza.builder.types.PizzaType;

public interface Builder {
    void setPizzaType(PizzaType type);
    void setSauceType(SauceType sauce);
}
