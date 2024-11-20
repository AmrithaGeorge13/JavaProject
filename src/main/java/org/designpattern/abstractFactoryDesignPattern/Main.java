package org.designpattern.abstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFurnitureFactory.createChair();
        modernChair.create();
        Table table = modernFurnitureFactory.createTable();
        table.create();

        VictorianFurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFurnitureFactory.createChair();
        victorianChair.create();
        Table victorianTable = victorianFurnitureFactory.createTable();
        victorianTable.create();

    }
}
