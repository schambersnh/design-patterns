package main.commandpattern.receiver;

/**
 * Created by Stephen on 8/6/18.
 */
public class CeilingFan extends Receiver {

    public CeilingFan(String location) {
        this.location = location;
    }

    private int speed;

    public void high() {
        System.out.println("Ceiling fan on high");
    }

    public void medium() {
        System.out.println("Ceiling fan on medium");

    }

    public void low() {
        System.out.println("Ceiling fan on low");

    }

    public void off() {
        System.out.println("Ceiling fan off");

    }

    public void getSpeed() {
        System.out.println("Ceiling fan speed: " + speed);
    }

}
