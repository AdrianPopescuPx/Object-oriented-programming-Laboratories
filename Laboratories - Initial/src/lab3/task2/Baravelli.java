package lab3.task2;

import lab3.task1.CandyBox;

public class Baravelli extends CandyBox {

    float radius;
    float height;


    public Baravelli(){}
    public Baravelli(float radius, float height, String flavor, String origin) {
        super(flavor, origin);
        this.radius = radius;
        this.height = height;
        }
        public float getVolume() {
        return 20.5F;
    }
    public String toString() {
        return "The " + super.toString() + " has volume " + this.getVolume();
    }
    void printBaravelliDim() {
        System.out.println("Radius: " + this.radius + " Height: " + this.height);
    }
}
