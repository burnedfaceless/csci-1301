package ch01;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Need to get miles (from where?)
        System.out.print("Number of miles: ");
        double miles = input.nextDouble();

        // Need to get gallons (from where?)
        System.out.print("Number of gallons: ");
        double gallons = input.nextDouble();

        // Calculate miles per gallon -> per is always division
        double mpg = miles / gallons;

        // Output results in a "good" manner
        System.out.println(miles + " miles per " + gallons + " gallon: " + mpg);
    }
}