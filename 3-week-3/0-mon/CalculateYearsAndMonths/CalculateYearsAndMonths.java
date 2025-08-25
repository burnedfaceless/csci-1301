import java.util.Scanner;

class CalculateYearsAndMonths {

    public static void main(String[] args) {
        // input
        Scanner input = new Scanner(System.in);
        // prompt user for number of months
        System.out.print("Enter total number of months: ");
        int totalMonths = input.nextInt();

        // processing
        int totalYears = totalMonths / 12;
        int totalMonthsLeftover = totalMonths % 12;

        // output
        System.out.println("You have " + totalYears + " year(s) and " + totalMonthsLeftover + " month(s) leftover.");
    }

}