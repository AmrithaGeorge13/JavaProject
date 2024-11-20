package org.designpattern.decoratorDeisgnPattern;

public class Paneer  extends ToppingDecorator{
    Pizza topping;
    public Paneer(Pizza topping) {
        super(topping);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+ 70;
    }
}
