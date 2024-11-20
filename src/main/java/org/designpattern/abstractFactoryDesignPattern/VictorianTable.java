package org.designpattern.abstractFactoryDesignPattern;

public class VictorianTable implements Table {

    @Override
    public void create() {
        System.out.println("Creating Victorian Table");
    }
}
