package lab5.task1;

import java.util.Random;

public class RandomOutTask implements Task{

    int randomNumber;
    public RandomOutTask() {
        Random rand = new Random();
        randomNumber = rand.nextInt(1000);
    }
    public void execute() {
        System.out.println(randomNumber);
    }
}
