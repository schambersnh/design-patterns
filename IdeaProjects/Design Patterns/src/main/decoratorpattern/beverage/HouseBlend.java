package main.decoratorpattern.beverage;

/**
 * Created by Stephen on 8/3/18.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
