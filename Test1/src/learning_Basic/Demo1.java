package learning_Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\\\\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https:\\www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		
	}

}
