package testrepository1;

import java.util.Scanner;

public class MinutesToYearsDaysConvertor {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of minutes: ");
			
			
			if (!scanner.hasNextDouble()) {
			    System.out.println("Invalid input. Please enter a valid number.");
			    return;
			}
			
			double minutes = scanner.nextDouble();
			
			if (minutes < 0) {
			    System.out.println("Invalid input. Please enter a positive number.");
			    return;
			}
			
	
			long minutesInYear = 60 * 24 * 365;
			long years = (long) (minutes / minutesInYear);
			long days = (long) (minutes / 60 / 24) % 365;
			
			// Display the result
			System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		}
    }
}