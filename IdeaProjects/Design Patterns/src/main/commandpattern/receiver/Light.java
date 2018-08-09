package main.commandpattern.receiver;

/**
 * Created by Stephen on 8/6/18.
 */
public class Light extends Receiver {

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Light's on!");
    }

    public void off() {
        System.out.println("Light's off!");
    }
}
