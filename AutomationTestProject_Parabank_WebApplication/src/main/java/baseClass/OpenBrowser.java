package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//openBrowser and navigate to url

public class OpenBrowser {
	
	public WebDriver driver;
	public void openBrowser(String url)
	{
		System.setProperty("webdriver.driver.chrome", System.getProperty("user.dir")+"\\src\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(url);
	}

}
