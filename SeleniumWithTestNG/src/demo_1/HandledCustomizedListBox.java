package demo_1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandledCustomizedListBox {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		driver.get("https://www.travolook.in/?gclid=Cj0KCQjw9_mDBhCGARIsAN3PaFMSzHJfgvVbcKDdDeI4WPUDMkmbfkRqlNCklx85GUWpsm6sLtXaIt0aAhsgEALw_wcB");
		driver.manage().window().fullscreen();
		
		WebElement origin = driver.findElement(By.xpath("//input[@id='flying_from_N']"));
		
		Thread.sleep(2000);
		Actions actionobj = new Actions(driver);
		actionobj.click(origin).perform();
		actionobj.sendKeys(Keys.ARROW_DOWN).perform();
		actionobj.sendKeys(Keys.ARROW_DOWN.ENTER).perform();
		Thread.sleep(2000);
		driver.close();
	}
}
