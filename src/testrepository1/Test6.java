package testrepository1;

public class Test6 {
public static void main(String[] args) {
	int i = 86399/24;
	int	j= 86399%24;
	int k = i%60;
	int l = i/60;
		System.out.println(j+"Hour" +k+"Minutes" +l+"Seconds");
			
}
}