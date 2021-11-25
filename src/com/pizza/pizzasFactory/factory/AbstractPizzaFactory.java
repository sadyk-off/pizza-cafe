package com.pizza.pizzasFactory.factory;

import com.pizza.pizzasFactory.product.PizzaDough;
import com.pizza.pizzasFactory.product.PizzaSauce;
import com.pizza.pizzasFactory.product.PizzaTopping;

public abstract class AbstractPizzaFactory {

    public abstract PizzaDough createPizzaDough();
    public abstract PizzaSauce createPizzaSauce();
    public abstract PizzaTopping createPizzaTopping();

}
