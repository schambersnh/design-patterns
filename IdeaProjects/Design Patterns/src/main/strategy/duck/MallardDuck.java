package main.strategy.duck;

import main.strategy.behavior.fly.FlyWithWings;
import main.strategy.behavior.quack.Quack;

/**
 * Created by Stephen on 7/30/18.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I am a mallard duck, and dont you forget it");
    }
}
