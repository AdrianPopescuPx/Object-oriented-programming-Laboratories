package lab11.task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {

    public static void main(final String[] args) {
        MyMatrix test1 = new MyMatrix();
        MyVector3 test2 = new MyVector3();
        Integer[] vect = new Integer[3];
        vect[0] = 1;
        vect[1] = 1;
        vect[2] = 1;
        test2.setCoordinates(vect);
        Integer[][] matrix = new Integer[4][4];
        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 4; ++j) {
                matrix[i][j] = 1;
            }
        }
        test1.setMatrix(matrix);
        MyMatrix test3 = new MyMatrix();
        MyVector3 test4 = new MyVector3();
        test3 = test1;
        test4 = test2;
        test1.addValue(test3);
        test2.addValue(test4);
        System.out.println(test1.getMatrix() + " " + test2.getCoordinates());
    }
}
