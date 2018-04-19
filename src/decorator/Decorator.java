package decorator;

public class Decorator implements Component {

    private Component component;

    Decorator(Component component) {
        this.component = component;
    }

    public void operation() {
        component.operation();
    }

}
