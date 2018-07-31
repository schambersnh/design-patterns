package main.strategy.behavior.quack;

/**
 * Created by Stephen on 7/30/18.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
