package baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	
	public static WebDriver driver;
	public void open_browser()
	{
		//System.setProperty("www.chrome.driver", System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://devvendor.amealio.in/");
		driver.get("https://uatmerchant.amealio.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
