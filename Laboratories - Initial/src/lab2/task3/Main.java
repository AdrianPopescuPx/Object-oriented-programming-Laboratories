package lab2.task3;

public class Main {
    public static void main (String[] args) {
        Point test_point = new Point(12.5F, 15.3F);
        test_point.changeCoords(15.3F, 12.5F);
        System.out.println(test_point.toString());


        float[] array = {13.5F, 23, 24.5F , 50, -20, -45};
        Polygon poligon = new Polygon(array);
        System.out.println(poligon.toString());

    }
}
