package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openbrowser 
{
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https:\\www.google.com");
			String title = driver.getTitle();
			System.out.println(title);
			//Thread.sleep(2000);
			
			driver.get("https:\\www.facebook.com");
		//	Thread.sleep(1000);
			
			driver.manage().window().maximize();
			
			String a =driver.getTitle();
			System.out.println(a);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
			
			
			
			
			
			
		}

}
