package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {
	
//	@Test
//	public void TC1() {
//		String exp = "hrishikesh";
//		String act = "hrishikesh";
//	//	Assert.assertEquals(act, exp);
//		Assert.assertNotEquals(act,exp);
//	}
	
//	@Test
//	public void TC2() {
//		String exp="hrishikesh";
//		String act ="hrishikesh";
//		
//		Assert.assertEquals(act, exp,"act and exp result is diff");
//	}

	
//	@Test
//	public void TC3()
//	{
//		String exp="hrishikesh";
//		String act ="hrishikesh";
//		Assert.assertNotEquals(act, exp,"act and exp result is equal");
//	}
	
	@Test
	public void TC4() {
		String exp= null;
		
		Assert.assertNull(exp, "result is not null");
		
	}
//	@Test
//	public void TC1()
//	{
//	String exp = "hrishikesh";
//	String act= "hrishikesh";
//	//Assert.assertEquals(act, exp,"exp and act are diff");
//	
//	Assert.assertNotEquals(act, exp,"act and exp are equal");
//	
//	}	
	
}
