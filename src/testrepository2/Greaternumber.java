package testrepository2;

import java.util.Scanner;

class GreaterNumber{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Enter the third number:");
        double num3 = scanner.nextDouble();

        // Find the greatest number among the three
        double greatestNumber = findGreatestNumber(num1, num2, num3);

        // Print the result
        System.out.println("The greatest number is: " + greatestNumber);

        // Close the Scanner to prevent resource leak
        scanner.close();
    }

    // Method to find the greatest number among three numbers
    private static double findGreatestNumber(double a, double b, double c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
}