package lab13.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new DoubleOperations();
        System.out.println(calculator.add(2d, 3d));
        System.out.println(calculator.divide(9d, 4d));
        System.out.println(calculator.average(List.of(1d, 2d, 3d, 4d)));
        double num1 = Double.POSITIVE_INFINITY;
        double num2 = Double.POSITIVE_INFINITY;
        System.out.println(calculator.divide(num1, num2));
    }
}
