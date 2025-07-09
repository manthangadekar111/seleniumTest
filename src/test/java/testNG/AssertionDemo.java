package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	void testapp() {

		String str1 = "opencart";
		String str2 = "opencart";
		
		Assert.assertEquals(str1, str2);
	
	}

}
