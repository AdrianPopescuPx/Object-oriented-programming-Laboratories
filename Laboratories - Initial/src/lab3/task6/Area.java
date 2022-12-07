package lab3.task6;

import lab3.task4.CandyBag;

public class Area {
    CandyBag bag;
    int number;
    String street;

    public Area(){}
    public Area (int number, String street, CandyBag bag) {
        this.number = number;
        this.street = street;
        this.bag = bag;
    }

    public void getBirthdayCard() {
        System.out.println("Complete adress is: " + this.street + this.number);
        System.out.println("LA MULTI ANI!");
        System.out.println(bag.toString());
    }

}
