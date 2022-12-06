package lab2.task1;

public class Main {
    public static void main(String[] args) {
        Complex test = new Complex(5, 10);

        test = new Complex(); // aici ii va face valorile 0 0
        test.showNumber(); // am implementat metoda showNumber in test
        System.out.println(test.getReal() + " " + test.getImaginary());

        //acum vom crea o copie a lui test

        Complex test2 = new Complex(test);

        System.out.println(test2.getReal() + " " + test2.getImaginary());
    }
}
