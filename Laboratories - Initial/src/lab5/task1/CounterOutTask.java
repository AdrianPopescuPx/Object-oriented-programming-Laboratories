package lab5.task1;

public class CounterOutTask extends Global implements Task{

    public void execute() {
        Global.countour++;
        System.out.println(countour);
    }
}
