package main.decoratorpattern.beverage;

/**
 * Created by Stephen on 8/3/18.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
