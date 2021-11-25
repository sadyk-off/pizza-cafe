package com.pizza.pizzasFactory.concreteProduct.Pepperoni;

import com.pizza.pizzasFactory.product.PizzaTopping;

public class PepperoniTopping implements PizzaTopping {
    @Override
    public String getToppingParts() {
        return "1) Pepperoni sausage - 100 g, \n" +
                "2) Mozzarella - 130 g, \n" +
                "3) Freshly ground pepper (black). \n";
    }
}
