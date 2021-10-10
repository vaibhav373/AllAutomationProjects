package pom1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteMainPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		
		Login_page_1 login1 = new Login_page_1(driver);
		login1.enterUn();
		login1.enterPwd();
		login1.loginBtn();
		
		kite_Page_2 page_2 = new kite_Page_2(driver);
		page_2.enterpin();
		page_2.cntBtn();
		
		Kite_HomePage home = new Kite_HomePage(driver);
		home.userName();
	}

}
