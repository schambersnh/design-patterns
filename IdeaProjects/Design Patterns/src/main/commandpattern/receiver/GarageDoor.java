package main.commandpattern.receiver;

/**
 * Created by Stephen on 8/6/18.
 */
public class GarageDoor extends Receiver {

    public GarageDoor(String location) {
        this.location = location;
    }
    public void up() {
        System.out.println("GarageDoor door is open");
    }

    public void down() {
        System.out.println("GarageDoor door is down");
    }

    public void stop() {
        System.out.println("GarageDoor door is stopped");
    }

    public void lightOn() {
        System.out.println("GarageDoor light is on");
    }

    public void lightOff() {
        System.out.println("GarageDoor light is off");
    }
}
