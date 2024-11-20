package org.designpattern.decoratorDeisgnPattern;

public class FarmHousePizza extends Pizza{
    public FarmHousePizza() {
        description = "Farm house pizza";
    }
    @Override
    public int getCost() {
        return 200;
    }
}
