package pom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteBuyTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		driver = new ChromeDriver();

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//open zerodha site
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//login page
		Login_page_1 login1 = new Login_page_1(driver);
		login1.enterUn();
		login1.enterPwd();
		login1.loginBtn();
		
		//pin page
		Thread.sleep(1000);
		kite_Page_2 page_2 = new kite_Page_2(driver);
		page_2.enterpin();
		page_2.cntBtn();
		
		//home page
		Thread.sleep(1000);
		Kite_HomePage home = new Kite_HomePage(driver);
		home.userName();
		
		//buy Test
		Thread.sleep(1000);
		KiteSearchBoxTest input_1 = new KiteSearchBoxTest(driver);
		input_1.kiteSearchInput();
		input_1.MoveOnFirstElement();
		input_1.ClickBuyBtn();
		Thread.sleep(2000);
		input_1.enterQty();
		Thread.sleep(1000);
		input_1.ClickOnBuyQty();
		
		
		
	}
}
