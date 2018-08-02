package main.strategypattern.duck;

import main.strategypattern.behavior.quack.Quack;
import main.strategypattern.behavior.quack.QuackBehavior;

/**
 * Created by Stephen on 7/30/18.
 */
public class DuckCall {
    public QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void setQuackBehavior(QuackBehavior b) {
        this.quackBehavior = b;
    }

    public void quack() {
        quackBehavior.quack();
    }
}

