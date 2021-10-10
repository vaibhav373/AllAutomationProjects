package demo;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
		Thread.sleep(1000);
		
		driver.get("https://testandquiz.com/selenium/testing.html");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Hrishkesh");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='male']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@class='Automation']")).click();
		Thread.sleep(1000);
		
		WebElement test = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select test1= new Select(test);
		test1.selectByVisibleText("Performance Testing");
		//test1.selectByIndex(1);
//		List<WebElement> op = test1.getOptions();
//		System.out.println(op.size());
		System.out.println(test1.getOptions().size());
		
		List<WebElement> t = test1.getAllSelectedOptions();
		for(WebElement t1:t)
		{
			System.out.println(t1.getText());
			
		}
		
		WebElement d = driver.findElement(By.xpath("//button[contains(text(),'Double-click')]"));
		
		Actions d1 = new Actions(driver);
		d1.moveToElement(d).doubleClick().build().perform();
		
		Thread.sleep(5000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		Thread.sleep(2000);
		
//		WebElement src = driver.findElement(By.xpath("//img[@id='sourceImage']"));
//		Thread.sleep(1000);
//		WebElement dest = driver.findElement(By.xpath("//div[@id='targetDiv']"));
//		Actions d1 = new Actions(driver);
//		d1.dragAndDrop(src, dest).perform();		
//		d1.moveToElement(src).clickAndHold().moveToElement(dest).release().build().perform();
		
		
		
		
	}

}
