package lab13.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static void readAndPrintLine() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            if(line != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println("Incorrect input! Please try again");
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println("Error!!");
                }
            }
        }
    }

    public static void main(String[] args) {
        readAndPrintLine();
    }
}
