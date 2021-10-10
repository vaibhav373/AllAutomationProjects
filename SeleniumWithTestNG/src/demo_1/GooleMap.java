package demo_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooleMap {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/maps/@18.6480511,73.7595529,15z?hl=en&authuser=0");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//img[@class='searchbox-directions-icon']")).click();//click on direction
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[4]")).sendKeys("College Of Engineering Pune");//starting point
		driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[5]")).sendKeys("pune Station");//end point
		driver.findElement(By.xpath("(//button[@aria-label=\"Search\"])[3]")).click();
		
	}

}
