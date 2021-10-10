package demo_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe_1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

			driver.get("http://demo.guru99.com/test/guru99home/");


	//	driver.get("https://www.w3schools.com/tags/tag_iframe.ASP");
//		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		//driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]")).click();
		Thread.sleep(2000);
	//	WebElement ele = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	//	driver.switchTo().frame(ele);
	//	driver.findElement(By.xpath("(//i[@class='fa'])[2]")).click();
		//Thread.sleep(1000);
		
		
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("html/body/a/img")).click();
		    //Clicks the iframe
		//driver.switchTo().defaultContent();
		//Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().parentFrame();
		//driver.findElement(By.xpath("//a[@id='link2']/span[text()='DBMS']")).click();
		
		
			System.out.println("*********We are done***************");	
	

			Thread.sleep(1000);
			
			driver.close();
	}

}
