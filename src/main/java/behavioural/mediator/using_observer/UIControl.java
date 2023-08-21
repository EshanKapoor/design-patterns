package behavioural.mediator.using_observer;

import java.util.ArrayList;
import java.util.List;

//This class acts like Subject. Its children as concrete Subjects.
//It doesn't have a dialog box anymore. That is because now we are using Observer pattern, and we don't need
//to tell the dialog box who the owner is.
//Rather we are going to directly call the notifyObservers method and update the observer
public abstract class UIControl {
    private List<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(var observer : observers) {
            observer.update();
        }
    }

}
