package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_1 {

	@Test
	public void Tc1()
	{
		Reporter.log("running Tc1...",true);
		
	}
	
	@Test
	public void Tc2() {
		
		Reporter.log("running Tc2....",true);
		
	}
	
	@Test
	public void TC5()
	{
		Reporter.log("running TC5..",true);
	}
	
	
	
}
