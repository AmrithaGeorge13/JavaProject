package org.designpattern.decoratorDeisgnPattern;

public class Main {
    public static void main(String[] args) {
        Pizza margheritaPizza = new MargaritaPizza();
        margheritaPizza = new FreshTomato(margheritaPizza);
        margheritaPizza = new Jalapeno(margheritaPizza);
        margheritaPizza = new Barbeque(margheritaPizza);
        System.out.println(margheritaPizza.getDescription() + " Cost: " + margheritaPizza.getCost());

        // Second Pizza: FarmHouse with Fresh Tomato, Paneer
        Pizza farmHousePizza = new FarmHousePizza();
        farmHousePizza = new FreshTomato(farmHousePizza);
        farmHousePizza = new Paneer(farmHousePizza);
        System.out.println(farmHousePizza.getDescription() + " Cost: " + farmHousePizza.getCost());
    }
}
