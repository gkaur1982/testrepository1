package testrepository2;

import java.util.Scanner;

public class ChangeReturn {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the cost of the item: ");
			double cost = scanner.nextDouble();

			System.out.print("Enter the amount paid: ");
			double amountPaid = scanner.nextDouble();

      
			double change = amountPaid - cost;

			if (change < 0) {
			    System.out.println("Insufficient amount paid!");
			    return;
			}

			System.out.println("Change to be returned: " + change);

      
			int[] denominations = {100, 50, 25, 10, 5, 1}; 
			int[] numberOfCoins = new int[denominations.length];

			int remainingChange = (int) (change * 100); 

			for (int i = 0; i < denominations.length; i++) {
			    numberOfCoins[i] = remainingChange / denominations[i];
			    remainingChange %= denominations[i];
			}

			
			System.out.println("Change breakdown:");
			for (int i = 0; i < denominations.length; i++) {
			    if (numberOfCoins[i] > 0) {
			        System.out.println(numberOfCoins[i] + " x $" + denominations[i]/100.0);
			    }
			}
		}
    }
}
