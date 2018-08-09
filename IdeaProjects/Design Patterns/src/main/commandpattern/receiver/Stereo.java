package main.commandpattern.receiver;

/**
 * Created by Stephen on 8/6/18.
 */
public class Stereo extends Receiver {

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off () {
        System.out.println("Stereo is off");
    }

    public void setCd() {
        System.out.println("CD is set");
    }

    public void setDvd() {
        System.out.println("DVD is set");
    }

    public void setRadio() {
        System.out.println("Radio is set");
    }

    public void setVolume(int volume) {
        System.out.println("Volume is set to: " + volume);
    }
}
