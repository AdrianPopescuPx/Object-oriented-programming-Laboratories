package lab3.task2;

import lab3.task1.CandyBox;

public class ChocAmor extends CandyBox {

    float lenght;

    public ChocAmor() {
    }

    public ChocAmor(float lenght, String flavor, String origin) {
        super(flavor, origin);
        this.lenght = lenght;
    }

    public float getVolume() {
        return 30.5F;
    }
    public String toString() {
        return "The " + super.toString() + " has volume " + this.getVolume();
    }
}
