package demo_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartActionClassHover {
	
	

		public static void main(String[] args) throws InterruptedException {
			
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\New folder1\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			   driver.get("https://flipkart.com");
			    
			   Thread.sleep(2000);
			     
			     driver.manage().window().maximize();
			     
			    String urlpath =  driver.getCurrentUrl();
			     System.out.println(urlpath);
			     
			    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			  
			  //  WebElement loginBtnDeatils = driver.findElement(By.xpath("//a[text() = 'Login']"));
				
			    Actions actionObje = new Actions(driver);
			    
//			    Thread.sleep(1000);
//			    actionObje.moveToElement(loginBtnDeatils).perform();
//			    actionObje.sendKeys(Keys.ARROW_DOWN).perform();
			    
			 //   WebElement more = driver.findElement(By.xpath("//div[@class='exehdJ']"));
			   
//			    List<WebElement> homee = driver.findElements(By.xpath("//div[text() = 'Home']"));
//			    for(WebElement home:homee)
//			    {
//			    	System.out.println(home.getText());
//			    }
//			    
			 
			    
			   // actionObje.moveToElement(more).perform();
			  // actionObje.sendKeys(more, Keys.ARROW_DOWN).perform();
//			   Thread.sleep(1000);
//			   actionObje.sendKeys(Keys.ARROW_DOWN).click().build().perform();
			  //  actionObje.moveToElement(more, 0, 1).perform();
			   
			    Actions actionobj = new Actions(driver);
			    
			    WebElement home1 = driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
			    actionobj.moveToElement(home1).perform();
			    
			    WebElement home3 = driver.findElement(By.xpath("//a[contains(text(),'Living Room')]"));
			    actionobj.moveToElement(home3).perform();
//			    actionobj.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Living Room')]"))).perform();
			    Thread.sleep(1000);
			    Actions home4 = actionobj.moveToElement(driver.findElement(By.xpath("//a[text() = 'TV Units']")));
			    Thread.sleep(2000);
			    home4.click().perform();
			    
			    
			    
			  //a[text() = 'TV Units']
			   // WebElement home3 = driver.findElement(By.xpath("//a[contains(text(),'Living Room')]"));

			   
			   //Thread.sleep(1000);
			   //actionobj.moveToElement(home1).perform();
			   //actionobj.moveToElement(home3).perform();
			   
			   //  actionobj.moveToElement(home1).moveToElement(home3).click().perform();
			   
			  // home2.moveToElement(home1).
			 
		}

}
