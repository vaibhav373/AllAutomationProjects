package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteLoginTest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		// import the chromedrivers
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		 driver = new ChromeDriver();

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// open Site
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);

		driver.manage().window().maximize();

		// create object of each class and perform all operation

		Loginpage1_pom login1 = new Loginpage1_pom(driver);
		login1.enterUN();
		login1.enterPWD();
		login1.clickOnLoginbtn();

		Loginpage2PIN_pom pin = new Loginpage2PIN_pom(driver);
		pin.enterPin();
		pin.clickOnContinueBtn();

		HomePage homepage = new HomePage(driver);
		homepage.verifyUser();

		SearchShare searchAndBuyshare = new SearchShare(driver);
		searchAndBuyshare.clickOnSearchShare();
		searchAndBuyshare.moverCursorOnFirstSearch();
		searchAndBuyshare.clickOnBuyshareBtn();
		
		Thread.sleep(5000);
		KitLogout logout = new KitLogout(driver);
		logout.clickOnProfilebtn();
		logout.clickonLogoutbtn();
		
		
		//driver.close();
	}
}
