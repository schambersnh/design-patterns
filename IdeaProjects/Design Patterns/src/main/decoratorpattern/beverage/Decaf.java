package main.decoratorpattern.beverage;

/**
 * Created by Stephen on 8/3/18.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
