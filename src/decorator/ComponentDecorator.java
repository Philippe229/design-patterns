package decorator;

public class ComponentDecorator extends Decorator {

    public ComponentDecorator(Component component) {
        super(component);
    }

    /**
     * Change behavior, add behavior, remove behavior, etc.
     */
    @Override
    public void operation() {
        super.operation();
        addedOperation();

        // alternative:
        // component.operation();
    }

    private void addedOperation() {
        System.out.println("ComponentDecorator added operation.");
    }

}
