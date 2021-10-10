package automationProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	static WebDriver driver;
	
	public static void open_Browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\New folder1\\\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get("https://kite.zerodha.com");
		 
		 Thread.sleep(2000);
	}

}
