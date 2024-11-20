package org.designpattern.abstractFactoryDesignPattern;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        System.out.println("Victorian Furniture Factory");
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Victorian Furniture Factory");
        return new VictorianTable();
    }
}
