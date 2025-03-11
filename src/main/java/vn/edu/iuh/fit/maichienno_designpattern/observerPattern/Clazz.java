package vn.edu.iuh.fit.maichienno_designpattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Clazz implements Subject{
    private List<Observer> observers = new ArrayList<>();
    private String className;

    public Clazz(String className) {
        this.className = className;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        System.out.println("Thông báo từ lớp " + className + ": " + message);
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
