package com.pizza.notification.customer;

import com.pizza.notification.interfaces.IObserver;

public class PersonalDisplay implements IObserver {


    public PersonalDisplay(){

    }

    @Override
    public void update(String update) {
        System.out.println("==== The personal display ====");

        System.out.println(update);

        System.out.println("==============================");
        System.out.println("");

    }


}
