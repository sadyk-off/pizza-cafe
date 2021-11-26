package com.pizza.customCombo.concreteBuilder;

import com.pizza.customCombo.builder.PizzaBuilder;

public class HawaiianPizzaBuilder extends PizzaBuilder {

    private String name = "Hawaiian";
    private double price = 4100;

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
    public void buildDough() {
        pizza.setDough("thick");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("mild");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ham + pineapple");
    }
}
