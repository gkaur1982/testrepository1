package testrepository2;

import java.util.Scanner;

class Test2{
	public static void main(String[] args) {
		Scanner j = new Scanner(System.in);
		System.out.println("Enter value of i");	
		int i = j.nextInt();
	double square = Math.pow(i, 2);
	double cube = Math.pow(i, 3);
	double power = Math.pow(i, 4);
	//int q = Math.min(i, j);
	System.out.println("Square:"+square);
	System.out.println("Cube:"+cube);
	System.out.println("Fourth power:"+power);

	}
}