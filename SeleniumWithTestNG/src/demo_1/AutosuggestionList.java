package demo_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestionList {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		String expMoblieName = "POCO F1 (Steel Blue, 128 GB)";
		//String exp = "iphone 12";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9175338049");
//		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("@123456789");
//		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("POCO F1 (Steel Blue, 128 GB)");
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg'])[2]//div[@class='_2kHMtA']//a//div[@class='_4rR01T']")));
		WebElement getName = driver.findElement(By.xpath("(//div[@class='_1YokD2 _3Mn1Gg'])[2]//div[@class='_2kHMtA']//a//div[@class='_4rR01T']"));
		Thread.sleep(1000);
		
		System.out.println(getName);
		String actName = getName.getText();
		System.out.println(actName);
		if(actName.equals(expMoblieName))
		{
			System.out.println(actName);
			System.out.println("successfully verified");
		}
		else
		{
			System.out.println("test failed");
		}
//		List<WebElement> AllOptions = driver.findElements(By.xpath("//ul[contains(@class,'col')]//li"));
//		//System.out.println(AllOptions.size());
//		
//		for(WebElement option : AllOptions)
//		{
//			String act = option.getText();
//			if(act.equals(exp))
//			{
//				option.click();
//				Thread.sleep(1000);
//			}
//		}
		
	}

}
////ul[contains(@class,'col')]/li