package demo_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {

	@Test()
	void TC1() {
		Reporter.log("Smaple2 Running test1",true);
	}
	@Test()
	void TC2() {
		Reporter.log("Smaple2 Running test2",true);
	}
}
