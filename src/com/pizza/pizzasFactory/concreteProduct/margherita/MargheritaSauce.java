package com.pizza.pizzasFactory.concreteProduct.margherita;

import com.pizza.pizzasFactory.product.PizzaSauce;

public class MargheritaSauce implements PizzaSauce {
    @Override
    public String getSauceParts() {
        return "1) fresh tomatoes – 2 pieces, \n" +
                "2) garlic – 2 cloves, \n" +
                "3) basil – 1 bunch, \n" +
                "4) olive oil – 2 tablespoons, \n" +
                "5) italian herbs, pepper and salt. \n";
    }
}
