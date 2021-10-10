package demo_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseOFSelectAndArrayList {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vaibhav\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 driver.manage().window().fullscreen();
		 driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		 
		 
		 WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		 
		  Select s = new Select(month);
		  
		  
		 ArrayList<String> arrayListobj = new  ArrayList<String>();
		 
		 List<WebElement> listObj = s.getOptions();
		 
		 for(WebElement L:listObj)
		 {
			 String singleMonth = L.getText();
			 arrayListobj.add(singleMonth);
		 }
		 
		 Collections.sort(arrayListobj);
 		 
		 for(String sortedMonthsList :arrayListobj) {
 			 System.out.println(sortedMonthsList);
 		 }
		 
		 Thread.sleep(2000);
 		 
		 driver.close();
	}
}
