package main.strategypattern.behavior.fly;

/**
 * Created by Stephen on 7/30/18.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!");
    }
}
