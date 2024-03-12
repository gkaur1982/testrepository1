package testrepository2;

import java.util.Scanner;

class GreaterNumber{
	public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
       System.out.println("Enter the first number:");
       int num1 = a.nextInt();
       Scanner b = new Scanner(System.in);
        System.out.println("Enter the second number:");
        int num2 = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the third number:");
        int num3 = c.nextInt();
  if (num1>=num2 && num1>=num3) {
	  System.out.println("Greatest number is " +a);
  } else if (num2>=num1 && num2>=num3) {
	  System.out.println("Greatest number is " +b);
  } else
	  System.out.println("Greatest number is " +c);
  }
       
       
    }

   
