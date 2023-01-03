package lab10.main;

public class Test {
    public static void main(String[] args) {
        Client client = new Client();

        // Execute various tests

        testDraw(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testTextAndColor(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testResize(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testConnect(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testAllCommands(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testSimpleUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));

        testComplexUndoRedo(client);
        System.out.println(new String(new char[80]).replace("\0", "-"));
    }

    private static void testDraw(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");
        client.executeAction("draw rectangle");

        client.showDiagram();
    }

    private static void testTextAndColor(Client client) {
        testDraw(client);
        client.executeAction("change color", "0", "RED");
        client.executeAction("change color", "1", "BLUE");
        client.executeAction("draw rectangle");
        client.executeAction("change text", "0", "MyClass1");
        client.executeAction("change text", "5", "MyClass2");
        client.showDiagram();
    }

    private static void testConnect(Client client) {
        client.executeAction("connect", "0", "1");
        client.executeAction("connect", "1", "0");
        client.executeAction("connect", "0", "3");
        client.showDiagram();
    }

    private static void testResize(Client client) {
        client.executeAction("resize", "0", "30");
        client.executeAction("resize", "2", "10");
        client.executeAction("resize", "1", "50");
        client.executeAction("resize", "3", "40");
        client.showDiagram();
    }

    private static void testAllCommands(Client client) {
        testDraw(client);
        testTextAndColor(client);
        testConnect(client);
        testResize(client);
    }

    private static void testSimpleUndoRedo(Client client) {
        client.newDiagram();

        client.executeAction("draw rectangle");
        client.executeAction("change color", "0", "ORANGE");
        client.showDiagram();

        client.executeAction("draw rectangle");
        client.showDiagram();

        client.undo();
        client.showDiagram();

        client.redo();
        client.showDiagram();
    }

    private static void testComplexUndoRedo(Client client) {
        testDraw(client);
        client.showDiagram();
        client.undo();
        client.showDiagram();
        client.redo();
        client.showDiagram();

        testResize(client);
        client.showDiagram();
        client.undo();
        client.showDiagram();
        client.redo();
        client.showDiagram();

        testTextAndColor(client);
        client.showDiagram();
        client.undo();
        client.showDiagram();
        client.redo();
        client.showDiagram();

        testConnect(client);
        client.showDiagram();
        client.undo();
        client.showDiagram();
        client.redo();
        client.showDiagram();
    }
}
