package vn.edu.iuh.fit.maichienno_designpattern.observerPattern;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String message);
}
