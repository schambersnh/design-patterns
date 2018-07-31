package main.strategy.duck;

import main.strategy.behavior.fly.FlyNoWay;
import main.strategy.behavior.quack.Quack;

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
