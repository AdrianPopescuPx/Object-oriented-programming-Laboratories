package lab2.task3;

import java.util.Arrays;

public class Polygon {

    Point[] point;
    public Polygon(int n) {
        point = new Point[n];
    }

    public Polygon(float[] poly) {
        this(poly.length / 2 );
        for(int i = 0, k = 0; k < point.length; i += 2, k ++) {
            point[k] = new Point(poly[i], poly[i + 1]);
        }
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "point=" + Arrays.toString(point) +
                '}';
    }
}
