package lab3.task2;

import lab3.task1.CandyBox;

public class Main {
    public static void main(String[] args) {
        CandyBox canytest = new CandyBox("ferrero", "rosher");
        CandyBox lindtest = new Lindt(10.4F, 12.3F, 13.4F, "Linditts", "LINDT");
        System.out.println(lindtest.toString());

        CandyBox lindtest2 = new Baravelli(10.4F, 15.4F, "Linditts", "LINDT");
        System.out.println(lindtest2.toString());

        CandyBox lindtest3 = new ChocAmor(10.4F, "Linditts", "LINDT");
        System.out.println(lindtest3.toString());
    }
}
