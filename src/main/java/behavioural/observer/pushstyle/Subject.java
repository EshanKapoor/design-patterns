package behavioural.observer.pushstyle;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    protected void addObserver(Observer observer) {
        observers.add(observer);
    }

    protected void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(int value) {
        for(var observer : observers) {
            observer.update(value);
        }
    }
}
