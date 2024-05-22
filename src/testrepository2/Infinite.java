package testrepository2;

import java.util.Scanner;

public class Infinite {
  public static void main(String[] args) {
	Scanner num = new Scanner(System.in);
	while(true) {
		System.out.println("enter 2 digit numbers");
		int input = num.nextInt();
		int sum = input%10 + input/10;
		System.out.println("Sum:" +sum );
	}
	}
  
}
