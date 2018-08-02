package main.strategypattern.behavior.quack;

/**
 * Created by Stephen on 7/30/18.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
