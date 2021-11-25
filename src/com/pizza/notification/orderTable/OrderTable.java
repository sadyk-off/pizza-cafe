package com.pizza.notification.orderTable;

import com.pizza.notification.interfaces.IObservable;
import com.pizza.notification.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class OrderTable implements IObservable {

    private List<IObserver> personalDisplays;
    private int orderNumber;

    public OrderTable() {
        this.personalDisplays = new ArrayList<>();
    }

    @Override
    public void toAdd(IObserver personalDisplay) {
        this.personalDisplays.add(personalDisplay);
    }

    @Override
    public void toRemove(IObserver customer) {

    }

    @Override
    public void toNotify() {
        for(IObserver subscriber : this.personalDisplays) {
            subscriber.update(this.orderNumber + " order is ready.");
        }
    }


    public List<IObserver> getPersonalDisplays() {
        return personalDisplays;
    }

    public void setPersonalDisplays(List<IObserver> customers) {
        this.personalDisplays = customers;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
        toNotify();
    }
}
