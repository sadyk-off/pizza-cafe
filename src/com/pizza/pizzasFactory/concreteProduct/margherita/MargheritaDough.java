package com.pizza.pizzasFactory.concreteProduct.margherita;

import com.pizza.pizzasFactory.product.PizzaDough;

public class MargheritaDough implements PizzaDough {
    @Override
    public String getDoughParts() {
        return "1) Wheat flour / Flour - 250 g, \n" +
                "2) Yeast (fresh) - 3 g, \n" +
                "3) Water (cold) - 130 ml, \n" +
                "4) Olive oil, \n.";
    }
}
