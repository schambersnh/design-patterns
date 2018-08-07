package main.factorypattern.store;

import main.factorypattern.pizza.NYStyleCheesePizza;
import main.factorypattern.pizza.Pizza;

/**
 * Created by Stephen on 8/5/18.
 */
public class NYPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        /*else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        }
        else if (item.equals("clam")) {
            return new NYStyleCLaimPizza();
        }
        else if(item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }*/

        //for compilation purposes
        return null;
    }
}
