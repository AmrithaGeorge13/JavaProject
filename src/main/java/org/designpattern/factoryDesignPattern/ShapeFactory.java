package org.designpattern.factoryDesignPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}
