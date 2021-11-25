package com.pizza.pizzasFactory.concreteFactory;

import com.pizza.pizzasFactory.concreteProduct.Pepperoni.PepperoniDough;
import com.pizza.pizzasFactory.concreteProduct.Pepperoni.PepperoniSauce;
import com.pizza.pizzasFactory.concreteProduct.Pepperoni.PepperoniTopping;
import com.pizza.pizzasFactory.factory.AbstractPizzaFactory;
import com.pizza.pizzasFactory.product.PizzaDough;
import com.pizza.pizzasFactory.product.PizzaSauce;
import com.pizza.pizzasFactory.product.PizzaTopping;

public class PepperoniPizzaFactory extends AbstractPizzaFactory {


    private String name = "Pepperoni";
    private int price = 3400;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public PizzaDough createPizzaDough() {
        return new PepperoniDough();
    }

    @Override
    public PizzaSauce createPizzaSauce() {
        return new PepperoniSauce();
    }

    @Override
    public PizzaTopping createPizzaTopping() {
        return new PepperoniTopping();
    }
}
