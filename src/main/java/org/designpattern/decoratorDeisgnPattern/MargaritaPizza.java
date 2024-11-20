package org.designpattern.decoratorDeisgnPattern;

public class MargaritaPizza extends Pizza{
    public MargaritaPizza() {
        description = "Margarita Pizza";
    }
    @Override
    public int getCost() {
        return 200;
    }
}
