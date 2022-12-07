package lab3.task4;

import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.Lindt;

public class Main {
    public static void main (String[] args) {
        CandyBox test1 = new Lindt(12F, 12F, 13F, "Mariana", "carina");
        CandyBox test2 = new Baravelli(20F, 30F, "Poliana", "Ciocolata");
        CandyBag testare = new CandyBag();
        testare.addCandyBag(test1);
        testare.addCandyBag(test2);

        for(int i = 0; i < testare.candybag.size(); ++i) {
            System.out.println(testare.candybag.get(i));
        }
        Lindt testing = new Lindt(12F, 12F, 13F, "Mariana", "carina");
        testing.printLindtDim();

    }
}
