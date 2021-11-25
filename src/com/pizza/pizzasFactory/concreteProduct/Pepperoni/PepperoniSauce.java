package com.pizza.pizzasFactory.concreteProduct.Pepperoni;

import com.pizza.pizzasFactory.product.PizzaSauce;

public class PepperoniSauce implements PizzaSauce {


    @Override
    public String getSauceParts() {
        return "1) tomatoes - 3-5 pieces, \n" +
                "2) salt - 1/3 teaspoon, \n" +
                "3) olive oil - 10 ml, \n" +
                "4) oregano - 1/3 teaspoon, \n" +
                "5) dried basil - 1/3 teaspoon, \n" +
                "6) garlic – 2 cloves, \n" +
                "7) sugar - 1 teaspoon.\n";
    }
}
