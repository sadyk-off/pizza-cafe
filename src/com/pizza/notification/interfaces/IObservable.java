package com.pizza.notification.interfaces;

public interface IObservable {

    void toAdd(IObserver customer);
    void toRemove(IObserver customer);
    void toNotify();
}
