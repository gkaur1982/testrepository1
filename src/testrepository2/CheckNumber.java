package testrepository2;

import java.util.Scanner;

class CheckNumber{
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter Number");
		int i = number.nextInt();
		String num = "";
		if(i>=0){
		num ="Postive";
		}else
		{
		num ="Negative";
		}
		System.out.println("Number is " +num);
	}
}
