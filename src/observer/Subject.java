package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    void notifyObservers() {
        if (observers.size() == 0)
            System.out.println("No observers attached to notify!");

        for (Observer o : observers)
            o.update();
    }

}
