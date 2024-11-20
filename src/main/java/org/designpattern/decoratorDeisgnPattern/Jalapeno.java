package org.designpattern.decoratorDeisgnPattern;

public class Jalapeno extends ToppingDecorator{
    Pizza topping;
    public Jalapeno(Pizza topping) {
        super(topping);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+ 50;
    }
}
