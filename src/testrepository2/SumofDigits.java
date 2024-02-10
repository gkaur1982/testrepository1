package testrepository2;

import java.util.Scanner;

public class SumofDigits{
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int number= scanner.nextInt();
		int sum = 0;
		int remainder;
		while(number != 0) {
			remainder = number%10;
			sum += remainder;
			number/=10;
		}
		System.out.println("Sum of digits " +sum);
	}
}