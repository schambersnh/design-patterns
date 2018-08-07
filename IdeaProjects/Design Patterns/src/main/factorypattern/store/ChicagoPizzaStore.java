package main.factorypattern.store;

import main.factorypattern.pizza.ChicagoStyleCheesePizza;
import main.factorypattern.pizza.Pizza;

/**
 * Created by Stephen on 8/5/18.
 */
public class ChicagoPizzaStore extends PizzaStore {
    protected Pizza createPizza(String item) {
        if(item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        /*else if(item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        }
        else if(item.equals("pepperoni")) {
            return new CHicagoStylePepperoniPizza();
        }*/

        //for compilation purposes
        return null;
    }
}
