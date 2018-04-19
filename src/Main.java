import adapter.Adaptee;
import adapter.AdapteeToTargetAdapter;
import adapter.Target;
import composite.Component;
import composite.Composite;
import composite.Leaf;
import decorator.ComponentDecorator;
import decorator.ConcreteComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Choose a design pattern: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        try {
            int selection = Integer.parseInt(input);
            System.out.println("Input is: " + selection);

            switch (selection) {
                case 1:
                    composite();
                    break;
                case 2:
                    adapter();
                    break;
                case 3:
                    decorator();
                    break;
                default:
                    System.out.println("Number does not specify any design pattern.");
            }

            System.out.println("End of program.");
        } catch(NumberFormatException e) {
            System.out.println("Not a number!");
            System.exit(0);
        }
    }

    private static void composite() {
        Leaf leaf = new Leaf();
        Composite composite = new Composite();
        composite.add(leaf);

        List<Component> componentList = new ArrayList<>();
        componentList.add(leaf);
        componentList.add(composite);

        for (Component component : componentList)
            component.operation();
    }

    private static void adapter() {
        Target target = new AdapteeToTargetAdapter(new Adaptee());
        target.request();
    }

    private static void decorator() {
        decorator.Component component = new ConcreteComponent();
        decorator.Component decoratedComponent = new ComponentDecorator(new ConcreteComponent());
        component.operation();
        decoratedComponent.operation();
    }

}
