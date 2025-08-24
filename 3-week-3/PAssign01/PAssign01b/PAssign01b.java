/**
 * File: PAssign01b.java
 * Class: CSCI 1301
 * Author: Brian Abbott
 * Created on: Aug 24, 2025
 * Last Modified: Aug 24, 2025
 * Description: Prompt the user for the Base and Height of a triangle. Calculate area.
 */

import java.util.Scanner;

class PAssign01b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt the user for base and height
        System.out.print("Enter the triangle's base: ");
        double base = input.nextDouble();
        System.out.print("Enter the triangle's height: ");
        double height = input.nextDouble();

        // calculate the area of the triangle (area = 1/2 * Base * Height)
        double area = ((1.0 / 2.0) * base * height);
        // display output to user
        System.out.println("A triangle with base " + base + " and height " + height + " has an area of " + area + ".");
    }

}