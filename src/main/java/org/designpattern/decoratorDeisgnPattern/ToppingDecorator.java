package org.designpattern.decoratorDeisgnPattern;

public abstract class ToppingDecorator extends Pizza{
    Pizza pizza;
    public ToppingDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract String getDescription();
}
