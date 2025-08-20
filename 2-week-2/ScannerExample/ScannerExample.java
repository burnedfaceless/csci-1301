// Implicit Import
import java.util.*;

// Explicit import
import java.util.Scanner;

class ScannerExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a whole number: ");
        int number = input.nextInt();
        System.out.println(number);

    }

}