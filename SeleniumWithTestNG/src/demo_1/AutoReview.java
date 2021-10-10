package demo_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutoReview {

	public static void main(String[] args) throws InterruptedException {
		
		String name ="Books";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		Thread.sleep(1000);
		
//		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		search.sendKeys("Samsung");
//		Actions obj = new Actions(driver);
//		Thread.sleep(1000);
//		obj.sendKeys(search, Keys.ARROW_DOWN).perform();
//		obj.sendKeys(search, Keys.ARROW_DOWN).perform();
//		obj.sendKeys(search, Keys.ARROW_DOWN).perform();
//		obj.sendKeys(search, Keys.ARROW_DOWN).perform();
//		obj.sendKeys(search, Keys.ARROW_DOWN.ENTER).perform();
		
//		WebElement Alloptions = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
//		
//		Select selectopt = new Select(Alloptions);
//		selectopt.selectByVisibleText("Books");
		
		//(((//a[@class='_1fQZEK'])[1])//div)[18] get value
		//(((//a[@class='_1fQZEK'])[1])//div)[13] get name
		//(((((//a[@class='_1fQZEK'])[1])//div)[14])//span)[4]	
		
			}
}
