package lab1.task1;

import lab1.task1.VeterinaryReport;

public class VeterinaryTest {

    public static void main(String[] args) {
        VeterinaryReport vr = new VeterinaryReport();
        vr.cats = 99;
        vr.dogs = 199;
        vr.displayStatistics();
        System.out.println("The class method says there are " + vr.getAnimalsCount() + " animals");
    }
}