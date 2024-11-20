package org.designpattern.abstractFactoryDesignPattern;

public class ModernTable implements Table {
    @Override
    public void create() {
        System.out.println("Creating Modern Table");
    }
}
