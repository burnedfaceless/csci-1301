/**
 * File: Pedometer.java
 * Class: CSCI 1301
 * Author: Brian Abbott
 * Created on: Aug 17, 2025
 * Last Modified: Aug 21, 2025
 * Description: Display a String value to the console
 */

class Pedometer {

    public static void main(String[] args) {
        int steps = 115000;
        int days = 10;
        double stepsPerDay = steps / days;
        System.out.println("Average number of steps per day: " + stepsPerDay);
    }

}