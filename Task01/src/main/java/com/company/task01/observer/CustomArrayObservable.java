package com.company.task01.observer;

public interface CustomArrayObservable {

    void attach(CustomArrayObserver observer);

    void detach(CustomArrayObserver observer);

    void notifyObservers();
}
