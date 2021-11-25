package com.pizza;

import com.pizza.customCombo.builder.PizzaBuilder;
import com.pizza.customCombo.concreteBuilder.HawaiianPizzaBuilder;
import com.pizza.customCombo.cooker.Cooker;
import com.pizza.customCombo.product.Pizza;
import com.pizza.notification.customer.PersonalDisplay;
import com.pizza.notification.orderTable.OrderTable;
import com.pizza.pizzasFactory.concreteFactory.MargheritaPizzaFactory;
import com.pizza.pizzasFactory.concreteFactory.PepperoniPizzaFactory;
import com.pizza.pizzasFactory.factory.AbstractPizzaFactory;
import com.pizza.pizzasFactory.product.PizzaDough;
import com.pizza.pizzasFactory.product.PizzaSauce;
import com.pizza.pizzasFactory.product.PizzaTopping;

import java.util.HashMap;
import java.util.Map;

public class Main {


    public static Map<Integer, String> menu = new HashMap<>();




    public static void main(String[] args) {


        MargheritaPizzaFactory margheritaPizzaFactory = new MargheritaPizzaFactory();
        PepperoniPizzaFactory pepperoniPizzaFactory = new PepperoniPizzaFactory();
        HawaiianPizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();

        menu.put(1, margheritaPizzaFactory.getName());
        menu.put(2, pepperoniPizzaFactory.getName());
        menu.put(3, hawaiianPizzaBuilder.getName());

        System.out.println("Hello! My Friend \n" +
                "Over here you can see our pizzas: \n");


        // test notification
        OrderTable orderTable = new OrderTable();

        PersonalDisplay firstDisplay = new PersonalDisplay();
        PersonalDisplay secondDisplay = new PersonalDisplay();
        PersonalDisplay thirdDisplay = new PersonalDisplay();

        orderTable.toAdd(firstDisplay);
        orderTable.toAdd(secondDisplay);
        orderTable.toAdd(thirdDisplay);

        orderTable.setOrderNumber(1);
        orderTable.setOrderNumber(2);
        orderTable.setOrderNumber(3);
        ////////////////////////////

        System.out.println("_________________________________________________________________________________________");


        // test pizza builder pattern
        Cooker cooker = new Cooker();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        cooker.setPizzaBuilder(hawaiianPizzaBuilder);
        cooker.constructPizza();

        Pizza pizza = cooker.getPizza();
        //

        System.out.println("_________________________________________________________________________________________");

        // test abstract factory pizza
        AbstractPizzaFactory pepperoniPizzaFactory = new PepperoniPizzaFactory();

        PizzaDough pepperoniDough = pepperoniPizzaFactory.createPizzaDough();
        System.out.println(pepperoniDough.getDoughParts());
        System.out.println("================================");
        PizzaSauce pepperoniSauce = pepperoniPizzaFactory.createPizzaSauce();
        System.out.println(pepperoniSauce.getSauceParts());
        System.out.println("=================================");
        PizzaTopping pepperoniTopping = pepperoniPizzaFactory.createPizzaTopping();
        System.out.println(pepperoniTopping.getToppingParts());





    }


}
