package homework_1;

import java.util.ArrayList;

public class Trainee implements Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    String name;
    Boolean isUpright = true;

    Trainee(String name){
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update(this.isUpright);
        }
    }

    public void layDown() {
        if (this.isUpright) {
            System.out.println( this.name + " lay down.");
            this.isUpright = false;
            this.notifyObservers();
        }
    }

    public void standUp() {
        if (!this.isUpright) {
            System.out.println( this.name + " stood up.");
            this.isUpright = true;
            this.notifyObservers();
        }
    }
}
