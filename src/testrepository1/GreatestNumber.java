package testrepository1;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        // Input three numbers from the user
        System.out.println("Enter three numbers:");
        double num1 = a.nextDouble();
        double num2 = a.nextDouble();
        double num3 = a.nextDouble();

        // Find the greatest number among the three
        double greatest = num1;
        if (num2 > greatest) {
            greatest = num2;
        }
        if (num3 > greatest) {
            greatest = num3;
        }

        // Print the greatest number
        System.out.println("The greatest number is: " + greatest);

    }
}
