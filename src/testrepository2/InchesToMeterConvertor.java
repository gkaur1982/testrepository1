package testrepository2;
import java.util.Scanner;
public class InchesToMeterConvertor {
		    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number in inches: ");
	        
	        
	        String input = scanner.nextLine();
	        
	        try {
	           
	            double inches = Double.parseDouble(input);
	            
	            
	            double meters = inches * 0.0254;
	            
	            
	            System.out.printf("%.2f inches is %.2f meters%n", inches, meters);
	        } catch (NumberFormatException e) {
	           
	            System.out.println("Invalid input. Please enter a valid number.");
	        }

	     }
}
