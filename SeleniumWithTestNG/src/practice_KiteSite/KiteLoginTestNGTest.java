package practice_KiteSite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

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

public class KiteLoginTestNGTest {
	
	LoginPage_1 login_1;
	VerifyProfileName PN_1;
	LoginPage_2 login_2;
	Sheet sheet;
	KiteLogoutPage logoutPage;
	WebDriver driver;
	
	
	@BeforeClass
	public void openBrowser() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com");
		Thread.sleep(1000);
		
		FileInputStream file =  new FileInputStream("C:\\Users\\Vaibhav\\Downloads\\kiteCredentials.xlsx");
		sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		
		
		 login_1 = new LoginPage_1(driver);
		 login_2 = new LoginPage_2(driver);
		 PN_1 = new VerifyProfileName(driver);
		 logoutPage = new KiteLogoutPage(driver);
		
//		String login = sheet.getRow(0).getCell(0).getStringCellValue();
//		String pass = sheet.getRow(0).getCell(1).getStringCellValue();
//		Sheet pin = sheet.getRow(0).getCell(2).getSheet();
//		String PN = sheet.getRow(0).getCell(3).getStringCellValue();
		
	}
	
	@BeforeMethod
	public void setLoginpage()
	{
		login_1.enterUn(sheet.getRow(0).getCell(0).getStringCellValue());
		login_1.enterPwd(sheet.getRow(0).getCell(1).getStringCellValue());
		login_1.loginBtn();
		login_2.enterPin(sheet.getRow(0).getCell(2).getStringCellValue());
		login_2.clickOnContinueBtn();
	}
	
	@Test
	public void VerifyPN_1()
	{
		String actPN = PN_1.VerifyPN();
		String expPN = sheet.getRow(0).getCell(3).getStringCellValue();
		System.out.println("actPN " +actPN);
		System.out.println("expPN " +expPN);
		
		Assert.assertEquals(actPN, expPN,"act and exp results are diff");
	}
	
	@AfterMethod
	public void LogOut()
	{
		logoutPage.clickOnProfilebtn();
		logoutPage.clickonLogoutbtn();
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.close();
	}
	
}
