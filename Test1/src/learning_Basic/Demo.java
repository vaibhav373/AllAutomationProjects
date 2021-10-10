package learning_Basic;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.utility.RandomString;

public class Demo {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		 driver =	new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		

	
	//System.out.println(src);
	

	
		takeScrreenshot();
	
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//input[contains(@class,'inputtext')]")).sendKeys("abc");
	//	driver.findElement(By.id("email")).sendKeys("akjsg");
		//driver.findElement(By.name("pass")).sendKeys("sehfj");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		takeScrreenshot();
		
		Thread.sleep(1000);
		
		WebElement day = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select s = new Select(day);
		//s.selectByVisibleText("3");
		//s.selectByValue("13");
		s.selectByIndex(2);
		
	}
	
	public static void takeScrreenshot() throws IOException{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String r = RandomString.make(5);
		File dest = new File("C:\\Users\\Vaibhav\\Desktop\\New folder\\image"+r+".jpg");
		FileHandler.copy(src, dest);
	}
}
