package learning_Basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver =	new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"name\"]")).sendKeys("Vaibhav");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
		Thread.sleep(1000);
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
