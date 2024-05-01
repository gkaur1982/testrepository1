package testrepository1;

class Test5{
	public static void main(String[] args) {
		int i1 = 10;
		int j = i1++ + ++i1;

		int i2 = 10;
		int k = ++i2 + ++i2 + ++i2 + i2++;

		int i3 = 10;
		int m = ++i3 + i3++ + i3++ + i3++  + i3-- + i3-- + --i3;

System.out.println(j);

System.out.println(k);

System.out.println(m);
	}
} 