package demo_1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionAndListHandleOperations {
	public static void main(String[] args) throws InterruptedException {
		 String expText = "redmi note 10";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Vaibhav\\\\Downloads\\\\New folder1\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	 WebDriverWait wait = new WebDriverWait(driver,10);
	 
	 
		 
//		 driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_html_file_upload_button");
//		 driver.manage().window().maximize();
//	  
//		 
//	    
//	    
//	    
//	     WebElement Iframesss = driver.findElement(By.xpath("//iframe[@id=\"iframeResult\"]"));
//	     
//	    driver.switchTo().frame(Iframesss);
//	    
//	    WebElement filesss = driver.findElement(By.xpath("//input[@id=\"myFile\"]"));
//	    filesss.sendKeys("C:\\Users\\Vaibhav\\Downloads\\zerodha.xlsx");
//	     
	     
	     
		 //driver.close();
		 
		 
		 driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("redmi");
		 
		 Thread.sleep(2000);
		 
		 List<WebElement> serachList = driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
		  
		 System.out.println(serachList.size());
		 
		 for(WebElement option :serachList ) {
			 
			 System.out.println(option.getText());
			 
			 String acttext = option.getText();
			 System.out.println(acttext);
			 if(acttext.equals(expText)) {
				 option.click();
			 }
			 
		 }
		 
		// driver.close();
	}
}
