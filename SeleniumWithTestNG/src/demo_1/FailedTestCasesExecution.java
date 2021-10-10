package demo_1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailedTestCasesExecution {

	@Test
	public void TC1() {
		Reporter.log("Running test case 1");
	}
	
	@Test
	public void TC2() {
		Reporter.log("Running test case 2");
	//Assert.fail();
	}
	
	@Test
	public void TC3() {
		Reporter.log("Running test case 2");
	}
}
