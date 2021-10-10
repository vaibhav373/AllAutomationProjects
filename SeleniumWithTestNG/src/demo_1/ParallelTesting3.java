package demo_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting3 {

	@Test
	public void TC1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().fullscreen();
			driver.get("https://coinmarketcap.com/currencies/nem/");
			Thread.sleep(1000);
			driver.close();
	}
}
