package demo_1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnAnnotations {

	@BeforeClass void operBrowser() {
		Reporter.log("open browser",true);
	}
	
	@AfterMethod
	void logoutFromApp() {
		Reporter.log("Logout from app", true);
	}
	@Test 
	void m1() {
		Reporter.log("runing test m1", true);
	}
	
	@Test void m2() {
		Reporter.log("runnng to test m2 ", true);
	}
	@BeforeMethod
	void loginToApp() {
		
		Reporter.log("Login to app", true);
	}
	@AfterClass void closeBrower() {
		Reporter.log("Closed the browser",true);
	}
}
