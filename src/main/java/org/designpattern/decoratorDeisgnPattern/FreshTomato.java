package org.designpattern.decoratorDeisgnPattern;

public class FreshTomato extends ToppingDecorator{
    Pizza topping;
    public FreshTomato(Pizza topping) {
        super(topping);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+ 40;
    }
}
