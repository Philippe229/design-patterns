package factorymethod;

public class ConcreteProduct implements Product {
    @Override
    public void behavior() {
        System.out.println("ConcreteProduct behavior.");
    }
}
