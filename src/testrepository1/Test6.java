package testrepository1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner j = new Scanner(System.in);
		System.out.println("Enter Seconds");	
		int i = j.nextInt();
	int hours = i/ 3600;
	int remainingSeconds = i % 3600;
    int minutes = remainingSeconds / 60;
    int seconds = remainingSeconds % 60;
    System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");


    
}
}