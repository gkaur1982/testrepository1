package testrepository2;

import java.util.Scanner;

public class Fibonacci{
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number for Fibonanacci number");
		 int n = scanner.nextInt();
	        
	        int first = 0, second = 1;
	        System.out.println("Fibonacci sequence up to " + n + " terms:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	        }
	    }
	}