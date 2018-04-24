package visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visitConcreteElement(ConcreteElement concreteElement) {
        System.out.println("Access to ConcreteElement:");
        concreteElement.operation();
        // can also assign concreteElement to an instance variable
    }

}
