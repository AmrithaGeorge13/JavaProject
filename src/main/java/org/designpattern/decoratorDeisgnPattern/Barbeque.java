package org.designpattern.decoratorDeisgnPattern;

public class Barbeque  extends ToppingDecorator{
    Pizza topping;
    public Barbeque(Pizza topping) {
        super(topping);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Barbeque";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+ 60;
    }
}
