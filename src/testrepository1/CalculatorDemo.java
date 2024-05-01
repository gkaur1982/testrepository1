package testrepository1;

public class CalculatorDemo {
 public static void main(String[]args) {
	int a =52;
int b = 35;
Calculator b1 = new Calculator();
int sum=b1.add(a, b);
System.out.println(sum);

Practice a1 = new Practice();
a1.prog = "Test Program";
CalculatorDemo.z1(a1);
System.out.println(a1.prog);
}

public static void z1(Practice s1) {
	s1.prog = "Ne Data";
}
}
class Calculator{
	int add (int a, int b){
		int c=a+b;
		return c;
	}
}
class Practice{
	String prog ="";
}