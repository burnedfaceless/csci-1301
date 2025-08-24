/**
 * File: PAssign01a.java
 * Class: CSCI 1301
 * Author: Brian Abbott
 * Created on: Aug 24, 2025
 * Last Modified: Aug 24, 2025
 * Description: Prompt user for number of beverages ($0.50) and sandwiches ($2.75) they are purchasing. Calculate total.
 */

import java.util.Scanner;

class PAssign01a {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // store cost of items in a constant
        final double BEVERAGE_PRICE = 0.50;
        final double SANDWICH_PRICE = 2.75;

        // prompt the user for number of beverages and sandwiches
        System.out.print("Enter the number of Beverages: ");
        double numOfBeverages = input.nextDouble();
        System.out.print("Enter the number of sandwiches: ");
        double numofSandwiches = input.nextDouble();

        // calculate total cost
        double totalCost = (numOfBeverages * BEVERAGE_PRICE) + (numofSandwiches * SANDWICH_PRICE);

        // display output to user
        System.out.println("The total of " + numOfBeverages + " beverages and " + numofSandwiches + " sandwiches is $" + totalCost + ".");
    }

}