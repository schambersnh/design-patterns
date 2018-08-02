package main.observerpattern.display;

import main.observerpattern.observer.Observer;
import main.observerpattern.subject.Subject;

/**
 * Created by Stephen on 8/2/18.
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    private Subject weatherData;

    private float temperature;
    private float humidity;
    private float pressure;
    private float count;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Average weather statistics: temp=" + temperature/count + " humidity=" + humidity/count + " pressure" + pressure/count);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        count++;
        this.temperature += temperature;
        this.humidity += humidity;
        this.pressure += pressure;
        display();
    }
}
