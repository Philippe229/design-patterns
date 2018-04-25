package command;

public interface Command {

    void execute();

    // extension
    void undo();

}
