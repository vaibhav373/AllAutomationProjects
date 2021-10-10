package practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoClassOfSuite {
	
	@Test
	public void TC1()
	{
		
		Reporter.log("running test TC1", true);
		//Assert.fail();
		
	}
	
	@Test 
	public void TC2()
	{
		Reporter.log("running test TC2",true);
	}

}
//<test thread-count="5" name="Test2">
//<classes>
//  <class name="practice.ParallelTest2"/>
//</classes>
//</test>