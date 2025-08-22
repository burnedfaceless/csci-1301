/**
 * File: Lab02Prob02.java
 * Class: CSCI 1301
 * Author: Brian Abbott, Tyrone Darby
 * Created on: Aug 22, 2025
 * Last Modified: Aug 22, 2025
 * Description: Calculate a user's age, and miscellaneous info given a birth year of 1997
 */

class Lab02Prob02 {

    public static void main(String[] args) {
        // create an integer named birthYear and store 1998
        int birthYear = 1998;
        int currentYear = 2025;
        int currentAge = currentYear - birthYear;
        int ageIn15Years = currentAge + 15;
        int twiceAge = currentAge * 2;
        double halfAge = currentAge / 2.0;

        System.out.println("You were born in " + birthYear + " and are " + currentAge + " years old.");
        System.out.println("In 15 years, you will be " + ageIn15Years + " years old.");
        System.out.println("Someone twice your age is " + twiceAge + " years old.");
        System.out.println("Someone half your age is " + halfAge + " years old.");
    }

}