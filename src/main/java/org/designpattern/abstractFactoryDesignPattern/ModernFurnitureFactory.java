package org.designpattern.abstractFactoryDesignPattern;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        System.out.println("Modern Furniture Factory");
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        System.out.println("Modern Furniture Factory");
        return new ModernTable();
    }
}
