package com.pizza.pizzasFactory.concreteProduct.margherita;

import com.pizza.pizzasFactory.product.PizzaTopping;

public class MargheritaTopping implements PizzaTopping {
    @Override
    public String getToppingParts() {
        return "1) 250 grams of mozzarella cheese, \n" +
                "2) Cherry tomatoes cut in half, \n" +
                "3) other kind of cheeses. \n";
    }
}
