package main.strategy.duck;

import main.strategy.behavior.fly.FlyBehavior;
import main.strategy.behavior.quack.QuackBehavior;

/**
 * Created by Stephen on 7/30/18.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior b) {
        this.flyBehavior = b;
    }

    public void setQuackBehavior(QuackBehavior b) {
        this.quackBehavior = b;
    }

}
