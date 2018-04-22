package observer;

public class ConcreteObserver implements Observer {

    private ConcreteSubject concreteSubject;

    public ConcreteObserver(ConcreteSubject concreteSubject) {
        this.concreteSubject = concreteSubject;
        concreteSubject.attach(this); // optional
    }

    @Override
    public void update() {
        System.out.println(concreteSubject.getMessage());
    }

}
