package command;

public class ConcreteCommand implements Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Execute concrete command.");
        receiver.action();
    }

    @Override
    public void undo() {
        System.out.println("Undo concrete command.");
    }

}
