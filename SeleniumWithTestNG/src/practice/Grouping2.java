package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping2 {

	@Test(groups="orders")
	public void TC1() {
		
		Reporter.log("running TC1...",true);
		
	}
	
	@Test(groups="orders")
	public void TC2() {
		Reporter.log("running TC2...",true);
		
	}
	
	
	@Test(groups="dashboard")
	public void TC3() {
		Reporter.log("running TC3...",true);
		
	}
	
	
	@Test(groups="settings")
	public void TC4() {
		Reporter.log("running TC4...",true);
		
	}

	
}
