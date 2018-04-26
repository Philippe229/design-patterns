package builder;

/**
 * https://refactoring.guru/design-patterns/builder
 */
public interface Builder {

    Builder buildStepA();

    Builder buildStepB();

    // can have build steps with parameters

    // if builder can build objects from multiple hierarchies, remove this
    Product getProduct();
}
