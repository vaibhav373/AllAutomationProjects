package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

public class OpenBrowsers {
	
	public static WebDriver driver;
	 
	public static void open_Browser(String url) throws InterruptedException {		
		//System.setProperty("webdriver.chrome.driver", "C:\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedrivers\\chromedriver.exe");
			
		
		driver = new ChromeDriver();
		driver.get(url);		
	
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		SessionId s = ((RemoteWebDriver) driver).getSessionId();
	      System.out.println("Session Id is: " + s);
	}
}
