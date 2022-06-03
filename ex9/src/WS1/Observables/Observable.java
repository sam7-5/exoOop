package WS1.Observables;

import WS1.Observer.Observer;

import java.util.ArrayList;


public class Observable {


    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(int data) {
        for (Observer observer : observerList) {
            observer.update(data);
        }
    }

}
