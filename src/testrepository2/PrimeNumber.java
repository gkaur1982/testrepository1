package testrepository2;
public class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        int number = 2; // Start checking from 2
        System.out.println("First 20 prime numbers are:");
        
        // Loop until we find 20 prime numbers
        while (count < 20) {
            boolean isPrime = true;
            
            // Check if the number is prime
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            // If the number is prime, print it
            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }
            
            // Move to the next number
            number++;
        }
    }
}
