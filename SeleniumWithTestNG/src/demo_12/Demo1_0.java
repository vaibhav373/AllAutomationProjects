package demo_12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Demo1_0 extends GenericCode{
	
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://uatmerchant.amealio.com");
		
		driver.findElement(By.xpath("//input[@name='number']")).sendKeys("8669664700");  //user ID
		driver.findElement(By.xpath("//input[@id='outlined-adornment-password']")).sendKeys("Shivam@123");  //Pass
		driver.findElement(By.xpath("//button[text()='Login']")).click();   //Login Btn
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Continue Subscription']")).click();  // continue sub.
		driver.findElement(By.xpath("//i[@class='fa fa-bars']")).click();    // Hamburger menu
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='mySidenav']//div//h3[text()='Business Details']")).click();  //click on business details
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='mySidenav']//div//h4[text()='Business Type']")).click();    // click on Business Type
		//driver.findElement(By.xpath("(//div[@class=\"cuisine-main-padding column-2\"])//span[text()='Bakery']")).click();
		List<WebElement> obj = driver.findElements(By.xpath("(//div[@class='cuisine-main-padding column-2'])//span")); //Get the all list of Business type
		
//		for(WebElement obj1: obj)
//		{
//			System.out.println(obj1.getText());
//		}
	
		/*List<String> getlist2=new ArrayList<String>();
		getlist2.add("Bakery");
		getlist2.add("Buffet");
		getlist2.add("Fast Food");
		//String a[]= {"Bakery","Buffet","Fast Food"};
		*/
		
		//List<String> datafromexcel= excelSheetData();// This is done to get the data from the xcl thorugh generic
		
		/*for(String data11 : datafromexcel)
		{
			System.out.println(data11);
		}*/
		GenericCode gn= new GenericCode();
		//gn.selectServiceFromList(obj,datafromexcel);
		String[] getvalue = excelsheet_data();
		gn.selectServiceFromList(obj, getvalue);
		
//		String a[]= {"Bakery","Buffet","Fast Food"};
//		for (String p : a) {
//			System.out.println(p);
//			System.out.println();
//		for (WebElement businessType : obj) {
//			
//			//System.out.println(businessType.getSize());
//			System.out.println(businessType.getText());
//			
//				if (businessType.getText().equals(p)) {
//					businessType.click();
//					break;
//				}
//			}
//		}
	}
}

