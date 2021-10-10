package vendorOnboardingVerification;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineEvent {

public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://uatmerchant.amealio.com");
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@name='number']")).sendKeys("8669664700");
	driver.findElement(By.xpath("//input[@id='outlined-adornment-password']")).sendKeys("Shivam@123");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//button[text()='Next']")).click();
	//Thread.sleep(3000);
	driver.findElement(By.xpath("(//i[@aria-hidden='true'])[2]")).click();
	driver.findElement(By.xpath("(//div[@aria-controls='example-collapse-text'])[5]")).click();
	driver.findElement(By.xpath("(//a[@class='empty-div-selected'])[22]")).click();
	//driver.findElement(By.xpath("//h4[text()='Events Management']")).click();
	//driver.findElement(By.xpath("//h3[text()='Subscription']")).click();
	
//	Set<String> ids =driver.getWindowHandles();
//	ArrayList<String>a1 = new ArrayList<String>(ids);
//	driver.switchTo().window(a1.get(1));
//	driver.findElement(By.xpath("//button[text()='Continue to Subscription']")).click();
//	driver.findElement(By.xpath("//button[@title='Next Button']")).click();
}
}

