package testrepository2;

public class Armstrong {
	public static void isArmstrong(int left, int right)
	{
		for (int i = left; i <= right; i++) {
			int sum = 0;
			int temp = i;
			while (temp > 0) {
				// Finding the last digit
				int lastdigit = temp % 10;

				// Finding the sum
				sum += Math.pow(lastdigit, 3);
				temp /= 10;
			}

			if (sum == i) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		int left = 5, right = 1000;
		isArmstrong(left, right);
	}
}
