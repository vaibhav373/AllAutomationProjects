package demo_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class DemoProgram {
	
//	public static void main(String[] args) throws InterruptedException {
//		System.out.println("hello");
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
//		WebDriver driver =	new ChromeDriver();
//		
//		driver.get("https://www.facebook.com");
//		Thread.sleep(1000);
		
		
//	}
	
	@Test
	public void m1() {
		Reporter.log("hello");
	}

}
