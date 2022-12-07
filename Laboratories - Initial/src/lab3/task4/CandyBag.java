package lab3.task4;

import lab3.task1.CandyBox;

import java.util.ArrayList;

public class CandyBag {

    public ArrayList<CandyBox> candybag;
    public CandyBag() {
        candybag = new ArrayList<>();
    }
    public void addCandyBag(CandyBox candybox) {
        candybag.add(candybox);
    }

    @Override
    public String toString() {
        return "CandyBag{" +
                "candybag=" + candybag +
                '}';
    }
}
