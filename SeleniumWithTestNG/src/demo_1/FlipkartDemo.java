package demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FlipkartDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.flipkart.com");
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("vaibhavmore805@gmail.com");
	
	driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("more1234");

	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	Thread.sleep(4000);
	WebElement more = driver.findElement(By.xpath("//div[contains(text(),'More')]"));
	Actions obj = new Actions(driver);
	obj.moveToElement(more).perform();
//	WebElement insideMore = driver.findElement(By.xpath("(//ul//li//a[@class='_2kxeIr'])[1]"));
//	
//	obj.moveToElement(insideMore).build().perform();
}
}
