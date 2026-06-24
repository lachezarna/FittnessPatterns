package bg.uni.plovdiv.fitness.singleton;

import java.util.ArrayList;
import java.util.List;

import bg.uni.plovdiv.fitness.observer.Observer;

public class FitnessGym {

    private static FitnessGym instance;

    private String currentMode;
    private List<Observer> observers = new ArrayList<>();

    private FitnessGym() {
        currentMode = "Basic Training";
    }

    public static FitnessGym getInstance() {
        if (instance == null) {
            instance = new FitnessGym();
        }
        return instance;
    }

    public String getCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(String currentMode) {
        this.currentMode = currentMode;
        notifyObservers();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentMode);
        }
    }
}