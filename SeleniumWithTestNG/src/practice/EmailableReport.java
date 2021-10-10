package practice;


import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EmailableReport {
	
//	@BeforeMethod
//	public void m1()
//	{
//		Reporter.log("hiiii", true);
//	}
	
	@Test
	public void TC1()
	{
//		System.out.println("hello");
		Reporter.log("hello");
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("test case running", true);
		
	}
	
//	@AfterMethod
//	public void m2()
//	{
//		Reporter.log("hiiiiiiiiiiii",true);
//	}

}
