package learning_Basic;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocatorLearning {
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (3)\\\\chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/facebook.html");

	
		//Locate the elements using css Selector 
		
		//driver.findElement(By.cssSelector("input#email")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("input.pass")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("abc");
		
	//	driver.findElement(By.cssSelector("input[id^='email']")).sendKeys("abc");
		
		
		//driver.findElement(By.cssSelector("[id$='email']")).sendKeys("abc");
		//driver.findElement(By.cssSelector("input[id$='email']")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("[id$='email']")).sendKeys("abc");
		
		//driver.findElement(By.cssSelector("input[value*='n']")).click();
		
		
	}
	
}




