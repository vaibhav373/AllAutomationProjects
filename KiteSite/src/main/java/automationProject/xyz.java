package automationProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xyz   {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.get("https://kite.zerodha.com");
		 
		  
		 abc.captureScreenshot(driver, 11);
		 
		 Thread.sleep(2000);
		
	}
	}

	}
