package lab10.main;

import lab10.commands.*;
import lab10.diagram.DiagramCanvas;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        diagramCanvas.show();
    }

    public void newDiagram() {
        // TODO
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment:
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }
        invoker.execute(command);
    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.
        // If there is an exception when parsing the string arguments (NumberFormatException) catch it and
        // throw an IllegalArgumentException
        switch (type) {
            case CHANGE_TEXT -> {
                int id = Integer.parseInt(args[0]);
                ChangeTextCommand changeTextCommand = new ChangeTextCommand(diagramCanvas.getComponent(id), args[1]);
                return changeTextCommand;
            }
            case RESIZE -> {
                int id = Integer.parseInt(args[0]);
                Double percentage = Double.valueOf(args[1]);
                ResizeCommand resizeCommand = new ResizeCommand(diagramCanvas.getComponent(id), percentage);
                return resizeCommand;
            }
            case CHANGE_COLOR -> {
                String color = args[1];
                int id = Integer.parseInt(args[0]);
                ChangeColorCommand changeColorCommand = new ChangeColorCommand(diagramCanvas.getComponent(id), color);
                return changeColorCommand;
            }
            case CONNECT -> {
                int id = Integer.parseInt(args[0]);
                ConnectComponentsCommand connectComponentsCommand = new ConnectComponentsCommand(diagramCanvas.getComponent(id), args[1]);
                return connectComponentsCommand;
            }
            case DRAW_RECTANGLE -> {
                DrawRectangleCommand drawRectangleCommand = new DrawRectangleCommand(diagramCanvas);
                return drawRectangleCommand;
            }
        }

        return null;
    }

    public void undo(){
        invoker.undo();
    }

    public void redo() {
        invoker.redo();
    }
}
