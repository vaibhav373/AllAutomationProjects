package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;


public class demo1
{
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https:\\www.google.com");
		driver.get("https:\\www.youtube.com");
		Thread.sleep(1000);
		
		driver.navigate().to("https://www.youtube.com/watch?v=fRD_3vJagxk");	
		Thread.sleep(1000);
		//Wait.until(visible((By.ID, "video-title")));
		//driver.find_element_by_id("video-title").click();
		
		
//		driver.navigate().back();
//		Thread.sleep(1000);
//		
//		driver.navigate().forward();
//		Thread.sleep(1000);
//		
//		driver.navigate().refresh();
//		Thread.sleep(1000);
//		Dimension a = driver.manage().window().getSize();
//			
//		System.out.println(a);
//		Dimension d = new Dimension(300, 500);
//		driver.manage().window().setSize(d);
	}
}
