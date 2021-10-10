package demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo12 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com/");
//		
//		WebElement obj = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//		obj.sendKeys("mobile");
//		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		driver.get("http://www.flipkart.com");
		
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobile");
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		
	}
}
