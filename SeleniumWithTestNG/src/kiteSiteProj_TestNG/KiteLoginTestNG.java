package kiteSiteProj_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KiteLoginTestNG extends BaseClass{

	//WebDriver driver;
	LoginPage1 loginpage1;
	LoginPage2 loginpage2;
	Sheet sh;
	Logoutpage logoutpage;
	VerifyProfileName pn ;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException, InterruptedException{
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		driver.get("https://kite.zerodha.com");
		browserOpen();
		
		FileInputStream file  = new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\dummydata5.xlsx");
		sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 loginpage1 = new LoginPage1(driver);
		 loginpage2 = new LoginPage2(driver);
		 logoutpage = new Logoutpage(driver);
		  pn = new VerifyProfileName(driver);
		 
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException {
		loginpage1.setUserName(Utility.getTestData(0, 0));
		loginpage1.setPassword(Utility.getTestData(0, 1));
		loginpage1.clickOnLoginBtn();
		
		loginpage2.setPin(Utility.getTestData(0, 2));
		
		loginpage2.clickOnContinueBtn();
		
	}
	
	@Test
	public void verifyUserName() throws EncryptedDocumentException, IOException {
		String actualResult = pn.verifyProfileName();
		String expecResult = Utility.getTestData(0, 3);
		
		Assert.assertEquals(actualResult, expecResult, "Profile name not matched");
	}
	
	@AfterMethod
	public void logOutFromKite() {
		logoutpage.clickOnProfileBtn();
		logoutpage.clickOnLogoutBtn();
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
}
