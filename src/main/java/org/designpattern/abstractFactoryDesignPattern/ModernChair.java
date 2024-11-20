package org.designpattern.abstractFactoryDesignPattern;

public class ModernChair implements Chair {
    @Override
    public void create() {
        System.out.println("Creating Modern Chair");
    }
}
