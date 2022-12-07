package lab3.task2;

import lab3.task1.CandyBox;

public class Lindt extends CandyBox {

    float lenght;
    float width;
    float height;

    public Lindt() {
    }

    public Lindt(float lenght, float width, float height, String flavor, String origin) {
        super(flavor, origin);
        this.lenght = lenght;
        this.height = height;
        this.width = width;

    }

    public float getVolume() {
        return 10.5F;

    }
    public String toString() {
        return "The " + super.toString() + " has volume " + this.getVolume();
    }
    public void printLindtDim() {
        System.out.println("Lenght: " + this.lenght + " Width: " + this.width + " Height: " + this.height);
    }
}
