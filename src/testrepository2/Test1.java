package testrepository2;

import java.util.Scanner;

class Test1{
	public static void main(String[] args) {
	Scanner num1 = new Scanner(System.in);
	System.out.println("Enter value of i");	
	int i = num1.nextInt();
	Scanner num2 = new Scanner(System.in);
	System.out.println("Enter value of j");
	int j = num2.nextInt();
	int k= i+j;
	int l= i-j;
	int m=i*j;
	int n = (i+j)/2;
	int o = i-j;
	int p = Math.max(i, j);
	int q = Math.min(i, j);
	System.out.println("Sum:"+k);
	System.out.println("Minus:"+l);
	System.out.println("Product:"+m);
	System.out.println("Average:"+n);
	System.out.println("Distance:"+o);
	System.out.println("Max:"+p);
	System.out.println("Min:"+q);
	}
}