package demo_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserCompabilityTesting {
	
	@Parameters("browserName")
	@Test
	public void TC1(String browserName) throws InterruptedException{
		WebDriver driver = null; 
		
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			 driver = new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vaibhav\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		
		//Thread.sleep(2000);
		
		driver.close();
	}

}
