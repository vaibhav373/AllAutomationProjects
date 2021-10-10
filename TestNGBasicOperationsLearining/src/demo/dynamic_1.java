package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.flipkart.com/search?q=realme&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_4_2_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_4_2_na_na_na&as-pos=4&as-type=RECENT&suggestionId=realme&requestId=49edb6bb-5019-4211-a952-43d29de2b5af&as-searchtext=red");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi");
		
		WebElement text = driver.findElement(By.xpath("((//div[@class='gUuXy-'])//span)[4]"));
		
		

	}

}
