package org.designpattern.abstractFactoryDesignPattern;

public class VictorianChair implements Chair {
    @Override
    public void create() {
        System.out.println("Creating Victorian Chair");
    }
}
