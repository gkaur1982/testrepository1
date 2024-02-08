package testrepository1;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of the month (1-12): ");
        int month = scanner.nextInt();
        
        int days;
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                days = 31;
                break;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                days = 30;
                break;
            case 2:  // February
                System.out.print("Is it a leap year? (true/false): ");
                boolean isLeapYear = scanner.nextBoolean();
                if (isLeapYear)
                    days = 29;
                else
                    days = 28;
                break;
            default:
                System.out.println("Invalid month number entered.");
                return; // Exit the program if an invalid month is entered
        }
        
        System.out.println("Number of days in the month: " + days);
    }
}
