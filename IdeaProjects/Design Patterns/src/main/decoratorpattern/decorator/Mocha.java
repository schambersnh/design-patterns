package main.decoratorpattern.decorator;

import main.decoratorpattern.beverage.Beverage;

/**
 * Created by Stephen on 8/3/18.
 */
public class Mocha extends CondimentsDecorator {
    public Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }

}
