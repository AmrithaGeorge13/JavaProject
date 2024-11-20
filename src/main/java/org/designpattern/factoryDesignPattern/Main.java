package org.designpattern.factoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
        shape = shapeFactory.getShape("Rectangle");
        shape.draw();
        shape = shapeFactory.getShape("Square");
        shape.draw();
    }
}
