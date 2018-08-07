package main.decoratorpattern.beverage;

/**
 * Created by Stephen on 8/3/18.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
