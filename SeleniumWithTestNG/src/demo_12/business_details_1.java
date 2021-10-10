package demo_12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class business_details_1 {

public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions obj1 = new ChromeOptions(); // disable for web notification
		obj1.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(obj1); 
		driver.manage().window().maximize();
		
		driver.get("https://uatmerchant.amealio.com");
		
		String position = "Owner";
		//String position  = "Assistant Manager";
		//int next = 0;
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("8669664700"); //login ID
		driver.findElement(By.xpath("//input[@id='outlined-adornment-password']")).sendKeys("Shivam@123"); //Pass
		driver.findElement(By.xpath("//button[text()='Login']")).click();  // login btn
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue Subscription']")).click(); //Click on ctn sub.
		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();   // Hamburger menu
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='mySidenav']//div//h3[text()='Business Details']")).click();   // click on business details 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='mySidenav']//div//h4[text()='Point Of Contact']")).click();   // click on Point Of Contact
		Thread.sleep(2000);
		WebElement position1 = driver.findElement((By.xpath("//div[@aria-haspopup='listbox']")));    // click on position dropdown

		//	Actions obj = new Actions(driver);  // create action obj
		//	obj.click(position1).perform();
		//		
		position1.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("(//ul[@role=\"listbox\"])//li"));
		for(WebElement ele : list)
		{
			String Newposition = ele.getText();
			
			if(Newposition.contains(position))
			{
				ele.click();
			//	next++;
				break;
			}
		}
		
		
//		obj.sendKeys(Keys.ARROW_DOWN).perform();
//		obj.sendKeys(Keys.ENTER).build().perform();
}


//		public static void SelectValueFromDropdown(WebElement element, String value)
//		{
//			Select select = new Select(element);
//			select.selectByVisibleText(value);
//		}
		
}