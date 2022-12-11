package lab5.task1;

public class OutTask implements Task{

    String message = "";
    public OutTask(String prop) {
        message = prop;
    }
    public void execute() {
        System.out.println("This is your task\n" + message);
    }
}
