package testrepository1;

public class Calculator1 {
	public static void main(String[] args) {
		SCalculator sc= new SCalculator();
		int sum1=SCalculator.add(54,35,66);
		float sum2=sc.add(3.5f, 5.7f);
		System.out.println(sum1);
		System.out.println(sum2);
	}
}

class SCalculator{
	static int add(int i, int j) {
		return i+j;
	}
	static int add(int i, int j, int k) {
		return i+j+k;
	}
	float add(float i, float j) {
		return i+j;
	}
}