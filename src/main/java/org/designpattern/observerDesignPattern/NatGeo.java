package org.designpattern.observerDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class NatGeo implements NewsObservable {
    List<Observer> observers = new ArrayList<>();
    private String latestNews;

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("NatGeo Breaking News : " + latestNews);
        }
    }

    public void setLatestNews(String latestNews) {
        this.latestNews = latestNews;
        notifyObservers();
    }
}
