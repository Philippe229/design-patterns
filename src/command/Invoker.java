package command;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Invoker {
    private List<Command> commandList = new ArrayList<>();
    private Stack<Command> undoStack = new Stack<>();

    public void addCommand(Command command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (Command command : commandList) {
            command.execute();
            undoStack.push(command);
        }
    }

    // extension
    public void undoCommand() {
        undoStack.pop().undo();
    }

}
