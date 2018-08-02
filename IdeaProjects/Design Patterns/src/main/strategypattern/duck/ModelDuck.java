package main.strategypattern.duck;

import main.strategypattern.behavior.fly.FlyNoWay;
import main.strategypattern.behavior.quack.Quack;

/**
 * Created by Stephen on 7/30/18.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior =  new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
