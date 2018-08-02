package main.observerpattern.observer;

/**
 * Created by Stephen on 8/2/18.
 */
public interface Observer {
    public void update(float temperature, float humidity, float pressure);
}
