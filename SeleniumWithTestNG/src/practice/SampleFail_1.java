package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleFail_1 {
	
	@Test
	public void Tc1()
	{
		Reporter.log("running Tc1...",true);
		Assert.fail();
		
	}
	
	@Test
	public void Tc2() {
		
		Reporter.log("running Tc2....",true);
		Assert.fail();
		
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3.....", true);
	}
	

}
