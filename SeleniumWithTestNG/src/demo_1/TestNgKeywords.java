package demo_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgKeywords {
	
	@Test void loginToApp1() {
		Reporter.log("Running loginToapp1 ", true);
	}
	
	@Test void loginToApp2() {
		Reporter.log("Running loginToapp2 ", true);
	}
	
	@Test(dependsOnMethods = {"loginToApp1", "loginToApp2"}) 
	void  logOutFromApp() {
		Reporter.log("ruuning logout from aapp" , true);
	}
	
	
	// priority 
	@Test(priority = -1)
	void TC1(){
		Reporter.log("ruunig tc1", true);
		
	}
	//timeout
	
	@Test(timeOut = 5000)
	void TC4() throws InterruptedException {
		Reporter.log("running tc4", true);
		//Thread.sleep(6000);
	}
	
	//enabled
	
	@Test(enabled =false)
	void TC2() {
		Reporter.log("ruuning tc2", true);
	}
	
	
	// invocationCOunt ---- to repeat the test case execution
	
	@Test(invocationCount = 3)
	void TC3() {
		Reporter.log("runnning test 3");
	}
	

}
