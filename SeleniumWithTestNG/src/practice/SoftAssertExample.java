package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
	@Test
	public void TC1() {
		
		String exp = "hrishikesh";
		String act = "hrishikesh";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertEquals(act, exp,"act and exp result is not equal");
		soft.assertNotEquals(act, exp,"act and exp result is equal");
		soft.assertAll();
	}

}
