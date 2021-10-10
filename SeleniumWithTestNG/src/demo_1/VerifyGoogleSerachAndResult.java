package demo_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyGoogleSerachAndResult {

	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	 driver.get("https://www.google.com/");
	 driver.manage().window().maximize();
	 
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("IBM");
	Thread.sleep(1000);
	WebElement matchingResult= driver.findElement(By.xpath("//div[@class='aajZCb']/ul"));
	List<WebElement> listResult= matchingResult.findElements(By.xpath("//ul[@class='erkvQe']//li[@class='sbct']"));
	System.out.println(listResult.size());
	
	//if you want to print matching results
	     for(WebElement results: listResult)
	       {
	         String value= results.getText();
	         System.out.println(value);
	         if(value.equals("ibm india")) {
	        	 results.click();
	        	 break;
	         }
	       } 
	     driver.close();
}
}
