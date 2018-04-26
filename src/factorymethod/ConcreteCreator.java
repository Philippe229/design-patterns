package factorymethod;

public class ConcreteCreator extends Creator {

    @Override
    public Product factoryMethod() {
        // A ConcreteCreator object depends on a ConcreteProduct specifically
        return new ConcreteProduct();
    }

}
