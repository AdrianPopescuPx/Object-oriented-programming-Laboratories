package lab2.task3;

public class Point {
    float coord1;
    float coord2;

    public Point(float c1, float c2) {
        this.coord1 = c1;
        this.coord2 = c2;
    }

    public void changeCoords(float c1, float c2) {
        this.coord1 = c1;
        this.coord2 = c2;
    }

    @Override
    public String toString() {
        return "(" + this.coord1 + " " + this.coord2 + ")";

    }

}

