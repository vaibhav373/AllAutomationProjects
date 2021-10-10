package demo_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgBasic {

	@Test void m1() {
		Reporter.log("test m1");
	}
	
	@Test void m2() {
		Reporter.log("Test m2");
	}
	

}
