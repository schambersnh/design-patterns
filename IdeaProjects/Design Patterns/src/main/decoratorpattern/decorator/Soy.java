package main.decoratorpattern.decorator;

import main.decoratorpattern.beverage.Beverage;

/**
 * Created by Stephen on 8/3/18.
 */
public class Soy extends CondimentsDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription () {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return 0.15 + beverage.cost();
    }
}
