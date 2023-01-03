package lab10.main;

import lab10.commands.*;

import java.util.LinkedList;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {

    private LinkedList<DrawCommand> history = new LinkedList<>();
    private LinkedList<DrawCommand> undoneCommands = new LinkedList<>();
    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
      // TODO

    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        command.execute();
        history.add(command);
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        if (history.isEmpty()) {
            return;
        }
        DrawCommand drawCommand = history.pop();
        if (drawCommand != null) {
            drawCommand.undo();
            undoneCommands.push(drawCommand);
        }
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        if (history.isEmpty()) {
            return;
        }
        DrawCommand drawCommand = undoneCommands.pop();
        if (drawCommand != null) {
            drawCommand.execute();
            history.push(drawCommand);
        }
    }
}
