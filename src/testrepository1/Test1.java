package testrepository1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 {
		
public void main() {
	int i = 10;
	int j = 7;
	int k;
	k = i;
	i = j;
	j = k;	
	System.out.println(i);
	System.out.println(j);
	
	
}

@Test(description= "this method verify story JIRA-134. Functionality for some abc data",
invocationCount = 10)
public void verify_add_method_with_valid_input() {
	int i = 10;
	int j = 20;
	int k = i + j;
	System.out.println(k); // expected : 30 , Actual : 30
	// Assertion // - Comparing actual and expected
	Assert.assertEquals(k, 40);
}

@Test
public void verify_add_method_with_invalid_input() {
	int i = 10;
	int j = 20;
	int k = i + j;
	System.out.println(k); // expected : 30 , Actual : 30
	// Assertion // - Comparing actual and expected
	Assert.assertEquals(k, 30);
}

@Test
public void verify_add_method_with_expired_input() {
	int i = 10;
	int j = 20;
	int k = i + j;
	System.out.println(k); // expected : 30 , Actual : 30
	// Assertion // - Comparing actual and expected
	Assert.assertEquals(k, 50);
}

}
