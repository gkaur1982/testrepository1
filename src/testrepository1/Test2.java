package testrepository1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Please enter a number between 1 and 10: ");
            number = scanner.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (number < 1 || number > 10);

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
