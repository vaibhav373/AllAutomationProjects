package scrollUpDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Argument;

public class ScrollAndStaticWebTable {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
			Thread.sleep(2000);		
		
		
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://coinmarketcap.com/");
			driver.manage().window().maximize();
//			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5000)");
			Thread.sleep(1000);
			
			
			//((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-5000)");
			
			
			//((JavascriptExecutor) driver ).executeScript("window.scrollBy(0,-5000)");
			JavascriptExecutor	js =	(JavascriptExecutor)driver;
			//WebElement ele = driver.findElement(By.xpath("(//div[@class=\"sc-16r8icm-0 dnwuAU\"]//a//div//p)[12]"));
			WebElement ele = driver.findElement(By.xpath("//p[text()='Dogecoin']"));
			
			
			  int rows = driver.findElements(By.xpath("//table[@class=\"cmc-table cmc-table___11lFC cmc-table-homepage___2_guh \"]/thead/tr/th")).size();
			  int colms = driver.findElements(By.xpath("//table[@class='cmc-table cmc-table___11lFC cmc-table-homepage___2_guh ']/tbody/tr")).size();
			
			  for(int i = 1 ; i<rows; i++) {
				  
				  String str = driver.findElement(By.xpath("(//table[@class='cmc-table cmc-table___11lFC cmc-table-homepage___2_guh ']//tbody//tr["+i+"]//td[3]//p)[1]")).getText();
					// System.out.println(str);
					  if(str.equals("Dogecoin")) {
						 
						  System.out.println("Currecies are= "+str);
						  System.out.println(driver.findElement(By.xpath("//table[@class='cmc-table cmc-table___11lFC cmc-table-homepage___2_guh ']//tbody//tr["+i+"]//td[4]//a")).getText());
						  break;
			  }
			  
			  
			  }
			
			
			//js.executeScript("arguments[0].scrollIntoView()",ele);
			//js.executeScript("arguments[0].scrollIntoView();", ele);
			Thread.sleep(1000);
			
			driver.quit();
			
			  
			
 	}
}
