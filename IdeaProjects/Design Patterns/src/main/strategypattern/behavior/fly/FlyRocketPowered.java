package main.strategypattern.behavior.fly;

/**
 * Created by Stephen on 7/30/18.
 */
public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
