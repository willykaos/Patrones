package edu.ucaldas.behaviour.observer;

import java.util.List;

public class Stock implements Subject {

    private List<Observer> observers;
    private double price;

    public void setPrice(double price) {
        this.price = price;
        // TODO
    }

    public void addObserver(Observer observer) {
        // TODO
    }

    public void removeObserver(Observer observer) {
        // TODO
    }

    public void notifyObservers() {
        // TODO
    }
}
