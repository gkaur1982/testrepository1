package testrepository2;

import java.util.Scanner;

public class Factor{
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find factor");
		int number = scanner.nextInt();
		System.out.println("Factor of" +number+ "are:");
		for(int i=1; i<=number; i++) {
			if(number % i == 0) {
				System.out.println(i+ "");
			}
		}
		
	}
}

