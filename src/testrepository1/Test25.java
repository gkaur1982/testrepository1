package testrepository1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test25 {
	@Test(description= "this method verify story JIRA-134. Functionality for some abc data",
			invocationCount = 10)
			public void verify_add_method_with_valid_input_from_test_25() {
				int i = 10;
				int j = 20;
				int k = i + j;
				System.out.println(k); // expected : 30 , Actual : 30
				// Assertion // - Comparing actual and expected
				Assert.assertEquals(k, 40);
			}
}
