package testrepository1;
import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            
            if (number == 0) {
                System.out.println("Number is 0. Exiting loop.");
                break;
            }
        }
        
    }
}