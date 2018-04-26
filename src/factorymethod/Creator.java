package factorymethod;

/**
 * If unclear check: https://refactoring.guru/design-patterns/factory-method/java/example
 */
public abstract class Creator {

    public abstract Product factoryMethod();

    public void anOperation() {
        // some statements before
        System.out.println("Creating a product:");
        Product product = factoryMethod();
        product.behavior();
        // more statements after
    }

}
