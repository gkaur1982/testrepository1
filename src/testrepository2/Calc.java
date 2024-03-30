package testrepository2;

public class Calc {

    // Non-static method to add two integers
    public int add(int i, int j) {
        int k = i + j;
        return k;
    }

    // Static method to add two integers
    public static int addStatic(int i, int j) {
        int k = i + j;
        return k;
    }

    public static void main(String[] args) {
        // Example usage of non-static method
        Calc math = new Calc();
        int result = math.add(3, 5);
        System.out.println("Result of non-static method: " + result);

        // Example usage of static method
        int staticResult = Calc.addStatic(3, 5);
        System.out.println("Result of static method: " + staticResult);
    }
}
