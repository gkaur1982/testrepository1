package testrepository2;
public class StringMethod{
	public static void main(String[] args) {
		String str1 ="This is java String";
		System.out.println(str1);
		System.out.println(str1.length());
		
		// How many characters without space
		String str2 = str1.replace(" ", "");
		System.out.println(str2);
		System.out.println(str2.length());
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.indexOf("i"));
		int index = 0;
		while (index != -1) {
			index = str1.indexOf("s",index +1 );
			if(index == -1) {
				break;
				
			}
			System.out.println(index);
		}
	}
}