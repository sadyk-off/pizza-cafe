package com.pizza.pizzasFactory.concreteFactory;

import com.pizza.pizzasFactory.factory.AbstractPizzaFactory;
import com.pizza.pizzasFactory.product.PizzaDough;
import com.pizza.pizzasFactory.product.PizzaSauce;
import com.pizza.pizzasFactory.product.PizzaTopping;

public class MargheritaPizzaFactory extends AbstractPizzaFactory {

    private String name = "Margherita";
    private double price = 3700;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public PizzaDough createPizzaDough() {
        return null;
    }

    @Override
    public PizzaSauce createPizzaSauce() {
        return null;
    }

    @Override
    public PizzaTopping createPizzaTopping() {
        return null;
    }
}
