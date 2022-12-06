package lab2.task1;

public class Complex {
    private int real;
    private int imaginary;

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public Complex (int v1, int v2) {
        this.real = v1;
        this.imaginary = v2;
    }
    public Complex() {
        this(0,0);
    }
    public Complex (Complex complex) {
        this.real = complex.real;
        this.imaginary = complex.imaginary;
    }
    public void addWithComplex(Complex complex) {
        this.real += complex.real;
        this.imaginary = complex.imaginary;
    }
    public void showNumber() {
        System.out.println(this.real + " " + this.imaginary);
    }


}
