/**
 * File: PAssign01c.java
 * Class: CSCI 1301
 * Author: Brian Abbott
 * Created on: Aug 24, 2025
 * Last Modified: Aug 24, 2025
 * Description: Calculate the pressure of an ideal gas.
 */

import java.util.Scanner;

public class PAssign01c {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // declare and set values
        double volume = 0.25;
        int numberOfMoles = 1;
        final double R = 8.31446;
        int temperature = 313;

        // calculate pressure
        double pressure = ((numberOfMoles * R * temperature) / volume);

        // output to user
        System.out.println("The pressure of " + numberOfMoles + " mole(s) of an ideal gas with volume " + volume + " m^3 at temperature " + temperature + " K is " + pressure + " pascals.");
    }

}