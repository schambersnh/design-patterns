package main.factorypattern;

import main.factorypattern.pizza.Pizza;
import main.factorypattern.store.ChicagoPizzaStore;
import main.factorypattern.store.NYPizzaStore;
import main.factorypattern.store.PizzaStore;

/**
 * Created by Stephen on 8/5/18.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza nyCheese = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyCheese.getName() + "\n");

        Pizza chicagoCheese = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + chicagoCheese.getName() + "\n");
    }
}
