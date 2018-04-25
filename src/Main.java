import adapter.Adaptee;
import adapter.AdapteeToTargetAdapter;
import adapter.Target;
import bridge.Employee;
import bridge.FullTimeEmployee;
import bridge.HourlyPay;
import bridge.Pay;
import chainofresponsibility.ConcreteHandler1;
import chainofresponsibility.ConcreteHandler2;
import chainofresponsibility.Handler;
import command.Command;
import command.ConcreteCommand;
import command.Invoker;
import command.Receiver;
import composite.Component;
import composite.Composite;
import composite.Leaf;
import decorator.ComponentDecorator;
import decorator.ConcreteComponent;
import observer.ConcreteObserver;
import observer.ConcreteSubject;
import observer.Observer;
import singleton.Singleton;
import templatemethod.AbstractClass;
import templatemethod.ConcreteClass;
import visitor.ConcreteElement;
import visitor.ConcreteVisitor;
import visitor.Element;
import visitor.Visitor;

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
                case 4:
                    bridge();
                    break;
                case 5:
                    singleton();
                    break;
                case 6:
                    observer();
                    break;
                case 7:
                    visitor();
                    break;
                case 8:
                    templateMethod();
                    break;
                case 9:
                    chainOfResponsibility();
                    break;
                case 10:
                    command();
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

    private static void bridge() {
        Pay hourlyPay = new HourlyPay();
        Employee fullTimeEmployee = new FullTimeEmployee(hourlyPay);
        fullTimeEmployee.salary();
    }

    private static void singleton() {
        Singleton singleton = Singleton.getInstance();
        singleton.operation();
    }

    private static void observer() {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer observer1 = new ConcreteObserver(concreteSubject);
        Observer observer2 = new ConcreteObserver(concreteSubject);
        concreteSubject.setMessage("Hello world");

        concreteSubject.detach(observer1);
        concreteSubject.detach(observer2);
        concreteSubject.setMessage("This message should not display because there are no observers.");
    }

    private static void visitor() {
        Element element = new ConcreteElement();
        Visitor visitor = new ConcreteVisitor();
        element.accept(visitor);
    }

    private static void templateMethod() {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.templateMethod();
    }

    private static void chainOfResponsibility() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        handler1.handle();
    }

    private static void command() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.addCommand(command);

        System.out.println("Possibly asynchronous call to commands:");
        invoker.executeCommands();

        System.out.println("Extension:");
        invoker.undoCommand();
    }
}
