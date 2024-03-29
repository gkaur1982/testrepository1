package testrepository2;
import java.util.Scanner;

public class ConsecutiveSquareSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Find the consecutive square sum
        findConsecutiveSquareSum(n);
    }

    public static void findConsecutiveSquareSum(int n) {
        int start = 1;
        int end = 1;
        int sum = 1;
        while (start <= n / 2) {
            if (sum < n) {
                end++;
                sum += end * end;
            } else if (sum > n) {
                sum -= start * start;
                start++;
            } else {
                // Print the consecutive sequence
                for (int i = start; i <= end; i++) {
                    System.out.print(i + "^2");
                    if (i < end) {
                        System.out.print(" + ");
                    }
                }
                System.out.println(" = " + n);
                // Move the start pointer to find other sequences
                sum -= start * start;
                start++;
            }
        }
    }
}
