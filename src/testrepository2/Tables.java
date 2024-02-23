package testrepository2;
public class Tables {
    public static void main(String[] args) {
        for (int i = 2; i <= 20; i++) {
            if (i == 6 || i == 12 || i == 17)
                continue; // Skip these numbers

            System.out.printf("Table of %d:\t", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d\t", i * j);
            }
            System.out.println();
        }
    }
}