package testClassAmazon;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.OpenBrowsers;
import pomforAmazon.LogintoAmazaon;

public class AmazonTestClass extends OpenBrowsers{
	LogintoAmazaon logintoamz;
	
	@BeforeClass
		void openBrowserForAmazonTest() throws InterruptedException {
		String url = "http://demo.automationtesting.in/Register.html";
		open_Browser(url);
		 logintoamz	= new LogintoAmazaon(driver);
		}
	
	
	@Test
	public void fillFOrm() {
		logintoamz.EnterFirstName();
		logintoamz.EnterLastName();
	}
	
	@AfterClass
	public void close() {
		driver.close();
	}
}
