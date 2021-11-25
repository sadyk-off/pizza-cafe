package com.pizza.customCombo.product;

public class Pizza {
    private String dough = ""; // тесто, корж
    private String sauce = ""; // соус
    private String topping = ""; // начинка

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getDough() {
        return dough;

    }
}
