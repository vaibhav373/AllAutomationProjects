package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTablesAndFindElements {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
	
		
		
		
		
//		driver.get("file:///C:/Users/Vaibhav/Desktop/checkbox1.html");
//		Thread.sleep(1000);
//		
//		List<WebElement> Click1 = driver.findElements(By.xpath("//input[@type='checkbox']"));
//		
//		
//		for(int i=0; i<Click1.size();i++)
//		{
//			if(i == 0 || i == 2) {
//				Click1.get(i).click();
//			}
//		}
//		
//		
		
		
//using forEach loop to select all checkbox		
//		for(WebElement selectCheckBox:Click1) {
//		
//			selectCheckBox.click();
//			Thread.sleep(500);
//		}
			
		
//		driver.get("https://www.facebook.com");
//		driver.manage().window().maximize();
//		Thread.sleep(1000);
//		
//		List<WebElement> link = driver.findElements(By.xpath("//a"));
//		System.out.println(link.size());
//		
//		for( WebElement getLink: link)
//		{
//			
//			System.out.println(getLink.getText());
//			
//		}
		
		driver.get("https://www.demoqa.com/automation-practice-form");
		//driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		
		
	  List<WebElement> allCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
	 
	  for( WebElement TotalChecksBox:allCheckbox) {
		TotalChecksBox.click();
		  Thread.sleep(1000);
		 
	
	}
	}
}
