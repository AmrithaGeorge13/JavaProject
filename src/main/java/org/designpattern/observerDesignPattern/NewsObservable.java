package org.designpattern.observerDesignPattern;

public interface NewsObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
