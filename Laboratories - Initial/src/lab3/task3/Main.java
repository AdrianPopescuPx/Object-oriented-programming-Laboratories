package lab3.task3;

import lab3.task1.CandyBox;
import lab3.task2.Lindt;

public class Main {
    public static void main (String[] args) {
        CandyBox test1 = new Lindt(12F, 12F, 13F, "Mariana", "carina");
        CandyBox test2 = new Lindt(12F, 13F, 13F, "Mariana", "carina");
        System.out.println(test1.equals(test2));
    }
}
