package org.designpattern.observerDesignPattern;

public class PhoneDisplay implements Observer{
    String news;
    @Override
    public void update(String message) {
        this.news = message;
        display();
    }
    public void display() {
        System.out.println("Phone news: "+news);
    }
}
