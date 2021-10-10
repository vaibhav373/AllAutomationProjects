package testClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseClass.OpenBrowsers;
import pomForFlipkart.Login;
import pomForFlipkart.UserProfile;

public class FlipkartTestCase1 extends OpenBrowsers {

	Login login;
	UserProfile profileName;
	
	@BeforeClass
	void openingBroserInTestCase() throws InterruptedException {
		
		String url = "https://www.flipkart.com/";
		open_Browser(url);
		login = new Login(driver);
		profileName = new UserProfile(driver);			
	}
	
	@BeforeMethod
	void login1() throws InterruptedException {
		login.setUserName();
		login.setPassword();
		login.clickOnLoginBtn();
		Thread.sleep(2000);
	}
	@Test
	void VerfiyUserProfile() throws InterruptedException {
		Thread.sleep(4000);
		profileName.VerifyUserProfile();
		Thread.sleep(5000);
	}
	
	@AfterMethod
	void logout() {
		
	}
	
	@AfterClass
	void closetheBrowser() {
		driver.close();
	}
}
