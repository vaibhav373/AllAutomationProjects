package demo;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DragandDropLearning {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://testandquiz.com/selenium/testing.html");
//		
//		driver.findElement(By.xpath("//input[@id=\'fname\']")).sendKeys("vaibhav");
//		driver.findElement(By.xpath("//button[@id='idOfButton']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='male']")).click();
//		driver.findElement(By.xpath("//input[@class='Automation']")).click();
//		
//		WebElement s = driver.findElement(By.xpath("//select[@id='testingDropdown']"));
//		
//		Select selectobj = new Select(s);
//		
//		selectobj.selectByVisibleText("Performance Testing");
//		
//		WebElement dblClick = driver.findElement( By.xpath("//button[@id=\"dblClkBtn\"]"));
//		
//		
//		Actions actionobj = new Actions(driver);
//		
//	
//		actionobj.doubleClick(dblClick).perform();
//		
//		Thread.sleep(1000);
//		Alert alertobj = driver.switchTo().alert();
//		
//		alertobj.accept();
//		Thread.sleep(2000);
		
		driver.get("https://demoqa.com/droppable");
	     WebElement scr = driver.findElement(By.xpath("//div[@id='draggable']"));//drag
	     WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));//drop
	     
	     
	     Thread.sleep(2000);
	     
	     Actions drgdrop = new Actions(driver);
	     
	   //  drgdrop.dragAndDrop(scr,dest).perform();
			
	  drgdrop.dragAndDrop(scr, dest).perform();
		
	}

}
