package visitor;

public class ConcreteElement implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitConcreteElement(this);
    }

    public void operation() {
        System.out.println("ConcreteElement operation.");
    }

}
