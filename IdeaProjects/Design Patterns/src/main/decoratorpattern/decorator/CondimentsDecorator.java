package main.decoratorpattern.decorator;

import main.decoratorpattern.beverage.Beverage;

/**
 * Created by Stephen on 8/3/18.
 */
public abstract class CondimentsDecorator extends Beverage {
    public abstract String getDescription();
}
