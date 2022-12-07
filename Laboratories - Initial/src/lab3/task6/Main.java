package lab3.task6;

import lab3.task1.CandyBox;
import lab3.task2.Baravelli;
import lab3.task2.Lindt;
import lab3.task4.CandyBag;

public class Main {
    public static void main (String[] args) {
        Area test = new Area();
        int streetNumber = 23;
        String street = "Strada Mosului nr.";

        CandyBag birthdayBag = new CandyBag();
        CandyBox box1 = new Lindt(12F, 12F, 13F, "Mariana", "Carina");
        CandyBox box2 = new Baravelli(20F, 30F, "Poliana", "Ciocolata");
        birthdayBag.addCandyBag(box1);
        birthdayBag.addCandyBag(box2);
        test = new Area(streetNumber, street, birthdayBag);
        test.getBirthdayCard();

        for(int i = 0; i < birthdayBag.candybag.size(); ++i) {
//            if(birthdayBag.candybag.get(i) instanceof Lindt)  {
//                Lindt testare = (Lindt) birthdayBag.candybag.get(i);
//                System.out.println(testare.toString());
//            }
//            if(birthdayBag.candybag.get(i) instanceof  Baravelli) {
//                Baravelli testare = (Baravelli) birthdayBag.candybag.get(i);
//                System.out.println(testare.toString());
//            }
            System.out.println(birthdayBag.candybag.get(i));
        }

        // testare cu un auto
        for(CandyBox box: birthdayBag.candybag) {
            System.out.println(box);
        }
    }
}
