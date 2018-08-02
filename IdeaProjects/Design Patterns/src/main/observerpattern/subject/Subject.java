package main.observerpattern.subject;

import main.observerpattern.observer.Observer;

/**
 * Created by Stephen on 8/2/18.
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
