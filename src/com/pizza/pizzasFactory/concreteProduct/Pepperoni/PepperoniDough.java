package com.pizza.pizzasFactory.concreteProduct.Pepperoni;

import com.pizza.pizzasFactory.product.PizzaDough;

public class PepperoniDough implements PizzaDough {
    @Override
    public String getDoughParts() {
        return "1) flour, \n"
                +  "2) warm water, \n"
                + "3) honey, \n"
                + "4) dry yeast, \n"
                + "5) olive oil, \n"
                + "6) salt.";
    }
}
