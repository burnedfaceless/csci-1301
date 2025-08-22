/**
 * File: Lab02Prob01.java
 * Class: CSCI 1301
 * Author: Brian Abbott, Tyrone Darby
 * Created on: Aug 22, 2025
 * Last Modified: Aug 22, 2025
 * Description: Calculate a user's age given a birth year of 1997
 */

class Lab02Prob01 {

    public static void main(String[] args) {
        // create an integer named birthYear and store 1998
        int birthYear = 1998;
        int currentYear = 2025;
        int currentAge = currentYear - birthYear;

        System.out.print("You were born in " + birthYear + " and are " + currentAge + " years old.");
    }

}