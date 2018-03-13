package composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> components;

    public Composite() {
        components = new ArrayList<>();
    }

    @Override
    public void operation() {
        for (Component component : components)
            component.operation();
    }

    public void add(Component c) {
        components.add(c);
    }
}
